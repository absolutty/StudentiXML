package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@XStreamAlias("exam")
public class Exam {

    private final String result;
    private final String date;
    private final String teacher;
    private final String grade;
    private final short credits_reg;
    private final short credits_obt;

    public Exam(String result, String date, String teacher, String grade, short credits_reg, short credits_obt) throws ParseException {
        this.result = result;

        validateDate(date);
        this.date = date;

        this.teacher = teacher;
        this.grade = grade;
        this.credits_reg = credits_reg;
        this.credits_obt = credits_obt;
    }

    private static final String DATE_FORMAT = "dd.MM.yyyy";
    private static void validateDate(String dateToTest) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);
        dateFormat.parse(dateToTest.trim());

    }

}

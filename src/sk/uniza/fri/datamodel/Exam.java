package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("exam")
public class Exam {

    private final String result;
    private final String date;
    private final String teacher;
    private final String grade;
    private final short credits_reg;
    private final short credits_obt;

    public Exam(String result, String date, String teacher, String grade, short credits_reg, short credits_obt) {
        this.result = result;
        this.date = date;
        this.teacher = teacher;
        this.grade = grade;
        this.credits_reg = credits_reg;
        this.credits_obt = credits_obt;
    }

}

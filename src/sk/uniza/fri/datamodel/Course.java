package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("course")
public class Course {

    private final String code;
    private final String name;
    private final String type;
    private final String semester;
    private final String ayear;
    private final short year_of_study;
    private final Exam exam;

    public Course(String code, String name, String type, String semester, String ayear, short year_of_study, Exam exam) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.semester = semester;
        this.ayear = ayear;
        this.year_of_study = year_of_study;
        this.exam = exam;
    }

}

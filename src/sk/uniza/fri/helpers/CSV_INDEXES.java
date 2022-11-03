package sk.uniza.fri.helpers;

//indexy v kt. stlpci sa dana informacia
public enum CSV_INDEXES {
    STUDENT_ID(0),
    STUDENT_NAME(1),
    STUDENT_SURNAME(2),
    STUDY_ID(3),
    FIELD_CODE(4),
    FIELD(5),
    COURSE_CODE(9),
    COURSE_NAME(10),
    COURSE_TYPE(11),
    COURSE_SEMESTER(7),
    COURSE_YEAR(8),
    COURSE_YEAR_OF_STUDY(6),
    EXAM_RESULT(12),
    EXAM_DATE(15),
    EXAM_TEACHER(16),
    EXAM_GRADE(23),
    CREDITS_REGISTERED(26),
    CREDITS_OBTAINED(27);

    private final int index;

    CSV_INDEXES(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}

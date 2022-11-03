package sk.uniza.fri.helpers;

import sk.uniza.fri.datamodel.*;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadCSV {

    private static final String DELIMITER = "\r\n";
    private static final String CSV_SPLIT_STRING = ";";

    public static HashMap<String, Record> loadStudents(Path from) {
        // HashMap obsahuje ako KEY id studenta, to zabezpeci velmi rychly pristup ak chceme vyhladavat
        // studenta na zaklade jeho ID. Value je samotna instancia studenta
        HashMap<String, Record> hashMap = new HashMap<>();

        try {
            Scanner scan = new Scanner(from);
            scan.useDelimiter(DELIMITER);
            scan.nextLine(); //preskoci prvy riadok

            while (scan.hasNext()) {
                String line = null;
                try {
                    line = scan.next();
                    String[] parts = line.split(CSV_SPLIT_STRING);

                    String studentId = parts[CSV_INDEXES.STUDENT_ID.getIndex()];
                    Student student;
                    Record record;

                    //hashMap este NEOBSAHUJE dany record
                    if (!hashMap.containsKey(studentId)) {
                        student = new Student(
                                studentId,
                                parts[CSV_INDEXES.STUDENT_NAME.getIndex()],
                                parts[CSV_INDEXES.STUDENT_SURNAME.getIndex()]
                        );

                        record = new Record(student);

                        hashMap.put(studentId, record);
                    }
                    //hashMap uz OBSAHUJE dany record
                    else {
                        record = hashMap.get(studentId);
                    }

                    Study study = new Study(
                            parts[CSV_INDEXES.STUDY_ID.getIndex()],
                            parts[CSV_INDEXES.FIELD_CODE.getIndex()],
                            parts[CSV_INDEXES.FIELD.getIndex()]
                    );

                    Exam exam = new Exam(
                            parts[CSV_INDEXES.EXAM_RESULT.getIndex()],
                            parts[CSV_INDEXES.EXAM_DATE.getIndex()],
                            parts[CSV_INDEXES.EXAM_TEACHER.getIndex()],
                            parts[CSV_INDEXES.EXAM_GRADE.getIndex()],
                            Short.parseShort(parts[CSV_INDEXES.CREDITS_REGISTERED.getIndex()]),
                            Short.parseShort(parts[CSV_INDEXES.CREDITS_OBTAINED.getIndex()].replaceAll("\r", ""))
                    );

                    Course course = new Course(
                            parts[CSV_INDEXES.COURSE_CODE.getIndex()],
                            parts[CSV_INDEXES.COURSE_NAME.getIndex()],
                            parts[CSV_INDEXES.COURSE_TYPE.getIndex()],
                            parts[CSV_INDEXES.COURSE_SEMESTER.getIndex()],
                            parts[CSV_INDEXES.COURSE_YEAR.getIndex()],
                            Short.parseShort(parts[CSV_INDEXES.COURSE_YEAR_OF_STUDY.getIndex()]),
                            exam
                    );

                    record.addStudy(study);
                    study.addCourse(course);
                }
                catch (ParseException e) { //chybny EXAM datum
                    WriteError.dateError(line);
                    System.out.println(e.getMessage());
                }
            }
            scan.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return hashMap;
    }

}

package sk.uniza.fri;

import com.thoughtworks.xstream.XStream;
import sk.uniza.fri.datamodel.Student;
import sk.uniza.fri.helpers.ReadCSV;

import java.nio.file.FileSystems;

public class Main {

    private static final String CSV_FILE = "input.csv";

    public static void main(String[] args) {
        ReadCSV.loadStudents(FileSystems.getDefault().getPath(CSV_FILE));
    }

    public static void zapis() {
        Student s1 = new Student("12345", "Peter", "Peteraj");
        Student s2 = new Student("54321", "Marek", "Velky");
        Student s3 = new Student("69785", "Jano", "Jankovsky");


        XStream xs = new XStream();
        xs.alias("student", Student.class);
        System.out.println(xs.toXML(s2));
    }
}

package sk.uniza.fri;

import sk.uniza.fri.helpers.ReadCSV;
import java.nio.file.FileSystems;

public class Main {

    private static final String CSV_FILE = "input.csv";

    public static void main(String[] args) {
        ReadCSV.loadStudents(FileSystems.getDefault().getPath(CSV_FILE));
    }

}

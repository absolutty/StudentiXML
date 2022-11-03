package sk.uniza.fri;

import sk.uniza.fri.datamodel.Record;
import sk.uniza.fri.helpers.ReadCSV;
import sk.uniza.fri.helpers.WriteXML;
import java.nio.file.FileSystems;
import java.util.HashMap;

public class Main {

    private static final String CSV_FILE = "input.csv";
    private static final String CSV_FILE_INVALID_DATE = "input-invalid.csv";


    public static void main(String[] args) {
        HashMap<String, Record> hashMap = ReadCSV.loadStudents(FileSystems.getDefault().getPath(CSV_FILE));
        WriteXML.writeStudents(hashMap);
    }

}

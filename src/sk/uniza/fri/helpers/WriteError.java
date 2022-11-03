package sk.uniza.fri.helpers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;

public class WriteError {

    private static final String ERROR_LOGS = "errors-log.txt";

    public static void dateError(String csvLine) {
        try(FileWriter fw = new FileWriter(ERROR_LOGS, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("*********************************************");
            out.printf("Error occured at [%s]\n", Instant.now());
            out.println("Date is not correct at line: \n------");
            out.println(csvLine);
            out .println("------\r");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

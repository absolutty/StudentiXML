package sk.uniza.fri.helpers;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.DomDriver;
import sk.uniza.fri.datamodel.Record;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteXML {

    public static void writeStudents(HashMap<String, Record> hashMap) {
        for (Record value : hashMap.values()) {
            XStream xstream = new XStream(new DomDriver("UTF_8", new NoNameCoder()));
            xstream.processAnnotations(Record.class);
            xstream.aliasPackage("", "sk.uniza.fri.datamodel");

            File file = new File(String.format("students%s%s.xml", File.separator, value.getStudentID()));

            try {
                xstream.toXML(value, new FileWriter(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

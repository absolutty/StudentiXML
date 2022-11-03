package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;

@XStreamAlias("record")
public class Record {

    private final Student student;
    @XStreamImplicit(itemFieldName="study")
    private final ArrayList<Study> study;

    public Record(Student student) {
        this.student = student;
        this.study = new ArrayList<>();
    }

    public void addStudy(Study study) {
        this.study.add(study);
    }

}

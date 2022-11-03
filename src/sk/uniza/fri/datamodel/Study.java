package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;

@XStreamAlias("study")
public class Study {

    private final String id;
    private final String field_code;
    private final String field;
    @XStreamImplicit(itemFieldName="course")
    private final ArrayList<Course> course;

    public Study(String id, String field_code, String field) {
        this.id = id;
        this.field_code = field_code;
        this.field = field;
        this.course = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.course.add(course);
    }

}

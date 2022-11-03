package sk.uniza.fri.datamodel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("student")
public class Student {

    private final String id;
    private final String name;
    private final String surname;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}




package sk.uniza.fri.datamodel;

import java.util.ArrayList;

public class Student {

    private final String id;
    private final String name;
    private final String surname;
    private ArrayList<Study> study;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.study = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}

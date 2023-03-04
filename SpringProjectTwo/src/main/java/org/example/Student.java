package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private String id;
    private String name;

    private List<Phone> ph;

    private Address add;

    public Student(String id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}

package com.example.Location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {


    private String name;


    public Person() {
        super();
    }
    public Person(String name) {
        super();
        this.name = name;

    }
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

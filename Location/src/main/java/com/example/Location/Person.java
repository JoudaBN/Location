package com.example.Location;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {


    private String name;
    private Vehicule vehicule;


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

    @OneToOne(mappedBy = "person")
    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

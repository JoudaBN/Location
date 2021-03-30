package com.example.Location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EntityScan
public class Vehicule {

    private String plateNumber;
    long key;
    private Car car;
    private Van van;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Van getVan() {
        return van;
    }

    public void setVan(Van van) {
        this.van = van;
    }
}

package com.example.Location;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Id;

@EntityScan
public class Car {

    private String plateNumber;
    private int numberOfSeats;



    public Car() {
        super();
    }

    public Car(String plateNumber, int numberOfSeats) {
        super();
        this.plateNumber = plateNumber;
        this.numberOfSeats= numberOfSeats;

    }
    @Id
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

   /* public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   /* public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car [plateNumber=" + plateNumber + ", numberOfSeats=" +numberOfSeats+"]";
    }

}

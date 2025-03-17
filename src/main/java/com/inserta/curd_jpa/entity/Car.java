package com.inserta.curd_jpa.entity;

public class Car extends Vehicle {
    private String type;
    private int seats;

    public Car(String brand, String model, String carRegistration, String type, int seats) {
        super(brand, model, carRegistration);
        this.type = type;
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Car { " +
                "type='" + type + '\'' +
                ", seats=" + seats +
                " }";
    }
}

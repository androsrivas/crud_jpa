package com.inserta.curd_jpa.entity;

public class Vehicle {
    private String brand;
    private String model;
    private String carRegistration;

    public Vehicle() {
    }

    public Vehicle(String carRegistration, String model, String brand) {
        this.carRegistration = carRegistration;
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    @Override
    public String toString() {
        return "Vehicle { " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carRegistration='" + carRegistration + '\'' +
                " }";
    }
}

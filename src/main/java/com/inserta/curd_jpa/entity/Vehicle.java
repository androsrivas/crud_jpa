package com.inserta.curd_jpa.entity;

public class Vehicle {

    //TODO añadir anotaciones JPA
    private int id;
    private String brand;
    private String model;
    private String carRegistration;
    private String type;

    public Vehicle() {}
    public Vehicle(String brand, String model, String carRegistration, String type) {
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
        this.type = type;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carRegistration='" + carRegistration + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

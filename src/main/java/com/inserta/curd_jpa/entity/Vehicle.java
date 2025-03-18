package com.inserta.curd_jpa.entity;

public abstract class Vehicle {

    private String brand;
    private String model;
    private String carRegistration;

    // Constructor
    public Vehicle(String brand, String model, String carRegistration) {
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
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

    // Método abstracto (a implementar por las subclases)
    public abstract void displayVehicleDetails();
}

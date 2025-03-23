package com.inserta.curd_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand", length = 45, nullable = false)
    private String brand;

    @Column(name = "model", length = 45, nullable = false)
    private String model;

    @Column(name = "carRegistration", length = 45, nullable = false)
    private String carRegistration;

    @Column(name = "type", length = 45, nullable = false)
    private String type;

    // Constructor vacío
    public Vehicle() {
    }
    // Constructor


    public Vehicle(String brand, String model, String carRegistration, String type) {
        this.brand = brand;
        this.model = model;
        this.carRegistration = carRegistration;
        this.type = type;
    }

    // Getters and Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método toString para una representación legible

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



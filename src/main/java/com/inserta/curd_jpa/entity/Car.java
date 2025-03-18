package com.inserta.curd_jpa.entity;

public class Car extends Vehicle {

    private String tipo; // Tipo de coche (por ejemplo, SUV, sedán, deportivo)
    private int plazas;  // Número de plazas

    // Constructor
    public Car(String brand, String model, String carRegistration, String tipo, int plazas) {
        super(brand, model, carRegistration); // Llama al constructor de la clase Vehicle
        this.tipo = tipo;
        this.plazas = plazas;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getPlazas() {
        return plazas;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    // Implementación del método abstracto de Vehicle
    @Override
    public void displayVehicleDetails() {
        System.out.println("Marca: " + getBrand());
        System.out.println("Modelo: " + getModel());
        System.out.println("Matrícula: " + getCarRegistration());
        System.out.println("Tipo: " + tipo);
        System.out.println("Plazas: " + plazas);
    }
}

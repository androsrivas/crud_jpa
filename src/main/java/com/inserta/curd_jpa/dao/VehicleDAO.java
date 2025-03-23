package com.inserta.curd_jpa.dao;

import com.inserta.curd_jpa.entity.Vehicle;

import java.util.List;

public interface VehicleDAO {

    void addVehicle(Vehicle vehicle);

    Vehicle getVehicleById(int id);

    List<Vehicle> getAllVehicles();

    void updateVehicle(Vehicle vehicle);

    void deleteVehicle(int id);
}


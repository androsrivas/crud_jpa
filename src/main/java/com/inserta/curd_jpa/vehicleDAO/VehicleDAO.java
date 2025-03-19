package com.inserta.curd_jpa.vehicleDAO;

import com.inserta.curd_jpa.entity.Vehicle;

public interface VehicleDAO {

    void save(Vehicle vehicle);

    Vehicle findById(Integer id);

    void delete(Vehicle vehicle);
    Vehicle delete()
}

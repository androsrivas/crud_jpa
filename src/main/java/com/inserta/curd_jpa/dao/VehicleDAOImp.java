package com.inserta.curd_jpa.dao;

import com.inserta.curd_jpa.entity.Vehicle;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

import java.util.List;


@Repository
public class VehicleDAOImp {
    private final EntityManager entityManager;

    @Autowired
    public VehicleDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void addVehicle(Vehicle vehicle) {
        entityManager.persist(vehicle);
    }

    @Override
    public Vehicle getVehicleById(int id) {
        return entityManager.find(Vehicle.class, id);
    }

    @Override
    @Transactional
    public List<Vehicle> getAllVehicles() {
        return entityManager.createQuery("FROM Vehicle", Vehicle.class).getResultList();
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        entityManager.merge(vehicle);
    }

    @Override
    @Transactional
    public void deleteVehicle(int id) {
        Vehicle vehicle = entityManager.find(Vehicle.class, id);
        if (vehicle != null) {
            entityManager.remove(vehicle); // Eliminar el vehículo si existe
        }
    }


}

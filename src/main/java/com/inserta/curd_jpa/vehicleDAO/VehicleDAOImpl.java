package com.inserta.curd_jpa.vehicleDAO;

import com.inserta.curd_jpa.entity.Vehicle;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class VehicleDAOImpl implements VehicleDAO{
    private EntityManager entityManager;

    @Autowired
    public VehicleDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Vehicle vehicle){
        this.entityManager.persist(vehicle);
    }

    @Override
    public Vehicle findById(Integer id) {
        return this.entityManager.find(Vehicle.class, id);
    }

    @Override
    @Transactional
    public void delete(Vehicle vehicle) {
        return this.entityManager.delete(Vehicle.class);
    }

}

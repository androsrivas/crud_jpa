package com.inserta.curd_jpa.repository;

import com.inserta.curd_jpa.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}

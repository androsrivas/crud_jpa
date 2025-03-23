package com.inserta.curd_jpa;

import com.inserta.curd_jpa.entity.Vehicle;
import com.inserta.curd_jpa.repository.VehicleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository articleRepository;

    @Test
    void shouldSaveAndFindVehicle() {
        Vehicle vehicle = new Vehicle("Dodge", "Coronet", "UX4567", "Sedan");
        Vehicle savedVehicle = vehicleRepository.save(vehicle);

        Optional<Vehicle> retrievedArticle = articleRepository.findById(savedVehicle.getId());
        assertThat(retrievedArticle).isPresent();
        assertThat(retrievedArticle.get().getBrand()).isEqualTo("Ford");
    }

    @Test
    void shouldReturnAllArticles() {
        Vehicle vehicle1 = new Vehicle("Vespa", "120", "WE4563", "Motorcycle");
        Vehicle vehicle2 = new Vehicle("Nissan", "Patrol", "AS4789", "Off-road vehicles");
        articleRepository.save(vehicle1);
        articleRepository.save(vehicle2);

        List<Vehicle> vehicles = vehicleRepository.findAll();
        assertThat(vehicles).hasSize(2);
    }

    @Test
    void shouldDeleteArticle() {
        Vehicle article = new Vehicle("Vespa", "120", "WE4563", "Motorcycle");
        Vehicle savedVehicle = vehicleRepository.save(article);

        articleRepository.deleteById(savedVehicle.getId());

        Optional<Vehicle> deletedVehicle = vehicleRepository.findById(savedVehicle.getId());
        assertThat(deletedVehicle).isNotPresent();
    }
}

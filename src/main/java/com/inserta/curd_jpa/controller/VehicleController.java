package com.inserta.curd_jpa.controller;

import com.inserta.curd_jpa.entity.Vehicle;
import com.inserta.curd_jpa.repository.VehicleRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) { this.vehicleRepository = vehicleRepository; }

    // GET - Obtener todos los artículos
    @GetMapping
    @Transactional(readOnly = true)
    public List<Vehicle> getAllArticles() {
        return vehicleRepository.findAll();
    }

    // GET - Obtener un artículo por ID
    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<Vehicle> getId(@PathVariable int id) {
        return vehicleRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - Obtener un artículo por ID
    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<Vehicle> getArticleById(@PathVariable int id) {
        return vehicleRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST - Crear un artículo
    @PostMapping
    @Transactional
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }


    // PUT - Actualizar un artículo
    @Transactional
    public ResponseEntity<Vehicle> updateArticle(@PathVariable int id, @RequestBody Vehicle vehicleDetails) {
        return vehicleRepository.findById(id).map(article -> {
            vehicle.setBrand(vehicleDetails.getBrand());
            vehicle.setModel(vehicleDetails.getModel());
            vehicle.setCarRegistration(vehicleDetails.getCarRegistration());
            vehicle.setType(vehicleDetails.getCarRegistration());
            vehicle updatedArticle = vehicleDetails.save(vehicle);
            return ResponseEntity.ok(updatedArticle);
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE - Eliminar un artículo
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteVehicle(@PathVariable int id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


    //POST - Crear n articulos de golpe
    @PostMapping("/bulk")
    @Transactional
    public List<Vehicle> createArticles(@RequestBody List<Vehicle> vehicles) {
        return vehicleRepository.saveAll(vehicles);
    }
}

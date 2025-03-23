package com.inserta.curd_jpa.rest;

import com.inserta.curd_jpa.entity.Vehicle;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("curd_jpa")
public class DemoRestController {

/*    List<Vehicle> vehicleList;

    @PostConstruct
    public void loadData() {
        vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle("Toyota", "Corolla","X2058", "Sedan"));
        vehicleList.add(new Vehicle("Ford", "F-150","X4474", "Truck"));
        vehicleList.add(new Vehicle("Tesla", "Model 3", "789-GHI", "Electric"));
        vehicleList.add(new Vehicle("Yamaha", "MT-07", "321-JKL", "Motorcycle"));
        vehicleList.add(new Vehicle("Harley-Davidson", "Iron 883", "654-MNO", "Motorcycle"));
        vehicleList.add(new Vehicle("Ducati", "Panigale V4", "987-PQR", "Motorcycle"));

    }

    @GetMapping("/vehicles")
    public List<Vehicle> listVehicles() {
        return vehicleList;
    }*/
}
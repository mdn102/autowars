package com.boulder.autowars;

import com.boulder.autowars.vehicles.Vehicle;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    // Initialize app
    public static void main(String[] args) {
        System.out.println("Auto Wars");
        System.out.println("Loading...");

        // Create a factory and and start building vehicles
        Factory factory = new Factory("GigaFactory 1");
        String json = Utils.loadJson("/Users/caitlyngrennan/Desktop/Projects/auto-wars/src/vehicleData.json");
        Vehicle[] readyToShip = factory.processOrders(json);

        // Create a dealership and add vehicles to the lot
        Dealership dealership = new Dealership("Kat's Kool Kars", BigDecimal.valueOf(1000000));
        dealership.addToLot(readyToShip);
        dealership.sellVehicle(dealership.carLot.get(15).getVin());
        dealership.checkInsurance();
    }
}

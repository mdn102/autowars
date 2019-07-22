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

        // Create a factory
        Factory factory = new Factory("GigaFactory 1");

        // Obtain a list of vehicle orders
        String json = Utils.loadJson("/Users/caitlyngrennan/Desktop/Projects/autowars/src/vehicleData.json");

        // Process the list of orders and build the vehicles
        Vehicle[] readyToShip = factory.processOrders(json);

        // Create a dealership and add vehicles to the lot
        Dealership dealership = new Dealership("Kat's Kool Kars", BigDecimal.valueOf(1000000));

        // Add cars to dealership
        dealership.addToLot(readyToShip);

        // Sell a vehicle
        dealership.sellVehicle(dealership.getRandomVehicle().getVin());

        // Check and renew insurance of vehicles
        dealership.checkInsurance();

        // Check and renew maintenance of vehicles
        dealership.checkMaintenance();

        // Check fuel level of a vehicle
        dealership.getRandomVehicle().checkFuel();

        // Refuel a vehicle
        dealership.refuel(dealership.getRandomVehicle());

        // Give a sales pitch
        System.out.println(dealership.salesPitch(dealership.getRandomVehicle()));

        // Test drive a vehicle
        Vehicle v = dealership.selectVehicleForTestDrive(2002, "Toyota", "Camry");
        if (v != null) {
            v.testDrive(20);
        }
    }
}

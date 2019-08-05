package com.boulder.autowars;

import com.boulder.autowars.vehicles.Vehicle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    // Initialize app
    public static void main(String[] args) {
        System.out.println("Auto Wars");
        System.out.println("Loading...");

        Scanner scanner = new Scanner(System.in);

        // Create a factory
        Factory factory = new Factory("GigaFactory 1");

        // Obtain a list of vehicle orders
        String json = Utils.loadJson("/Users/caitlyngrennan/Desktop/Projects/autowars/src/vehicleData.json");

        // Process the list of orders and build the vehicles
        factory.readyToShip = factory.processOrders(json);

        // Create a dealership
        System.out.print("Enter the name of your new dealership: ");
        Dealership dealership = new Dealership(scanner.nextLine(), BigDecimal.valueOf(1000000));

        // Add cars to dealership
        System.out.println("Let's get some cars in that lot.");
        System.out.println("How much would you like to spend? (Available: $" + dealership.balance + ")");
        System.out.print("Maximum amount: ");

        Vehicle[] purchased = dealership.purchaseVehicles(factory, scanner.nextBigDecimal());
        dealership.addToLot(purchased);

        // Sell a vehicle
//        dealership.sellVehicle(dealership.getRandomVehicle().getVin());

        // Check and renew insurance of vehicles
//        dealership.checkInsurance();

        // Check and renew maintenance of vehicles
//        dealership.checkMaintenance();

        // Check fuel level of a vehicle
//        dealership.getRandomVehicle().checkFuel();

        // Refuel a vehicle
//        dealership.refuel(dealership.getRandomVehicle());

        // Give a sales pitch
//        System.out.println(dealership.salesPitch(dealership.getRandomVehicle()));

        // Test drive a vehicle
//        Vehicle v = dealership.selectVehicleForTestDrive(2002, "Toyota", "Camry");
//        if (v != null) {
//            v.testDrive(20);
//        }
    }
}

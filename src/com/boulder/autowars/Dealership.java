package com.boulder.autowars;

import com.boulder.autowars.vehicles.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Dealership {

    String name;
    BigDecimal balance;
    ArrayList<Vehicle> carLot = new ArrayList<>();
    ArrayList<String> salesHistory = new ArrayList<>();

    public Dealership(String name, BigDecimal startingBalance) {
        this.name = name;
        this.balance = startingBalance;
    }

    // Adds vehicles to the lot and returns the number of vehicles added
    public int addToLot(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            this.balance = this.balance.subtract(v.getCostToDealership());
            this.carLot.add(v);
        }

        System.out.println("Vehicles added to lot: " + vehicles);
        return vehicles.length;
    }

    // Sells a vehicle by vin and returns the dealership balance after sale
    public BigDecimal sellVehicle(String vin) {
        boolean found = false;

        for (Vehicle vehicle : this.carLot) {
            if (!found) {
                if (vehicle.getVin().equals(vin)) {
                    this.carLot.remove(vehicle);
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Vehicle sold: " + vin);
        } else {
            System.out.println("No VIN match found: " + vin);
        }

        return this.balance;
    }

    // Checks vehicle insurance and returns an array of Vehicles with expired insurance
    public Vehicle[] checkInsurance() {
        ArrayList<Vehicle> expired = new ArrayList<>();
        LocalDate monthAgo = LocalDate.now().minusDays(30);

        for (Vehicle v : this.carLot) {
            LocalDate lastInsured = LocalDate.parse(v.getLastInsured().toString(), DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy"));
            System.out.println(Utils.DateDiff.inDays(lastInsured, monthAgo));
        }

        Vehicle[] result = new Vehicle[expired.size()];
        result = expired.toArray(result);

        return result;
    }
}

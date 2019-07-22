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
        Vehicle match = null;
        boolean found = false;

        for (Vehicle vehicle : this.carLot) {
            if (!found) {
                if (vehicle.getVin().equals(vin)) {
                    match = vehicle;
                    found = true;
                }
            }
        }

        if (found) {
            this.carLot.remove(match);
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
            int daysAgoLastInsured = Utils.DateDiff.inDays(lastInsured, monthAgo);

            if (daysAgoLastInsured > 30) {
                expired.add(v);
                renewInsurance(v);
            }
        }

        Vehicle[] result = new Vehicle[expired.size()];
        result = expired.toArray(result);

        if (result.length == 0) {
            System.out.println("All vehicles' insurance are up to date.");
        } else {
            System.out.println("Vehicle insurance renewed: " + result);
        }

        return result;
    }

    // Renew a vehicle's insurance
    public Vehicle renewInsurance(Vehicle v) {
        v.setLastInsured(new Date());
        return v;
    }
}

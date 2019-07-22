package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public class Vehicle {

    // Define properties/methods
    private String type, vin, make, model, color, description;
    private int year, wheels, mileage, fuel, fuelCapacity;
    private BigDecimal price, costToDealership;
    private Date lastInsured, lastServiced;
    private boolean clean;

    // Default constructor
    public Vehicle() {}

    // Constructor from order
    public Vehicle(JsonObject order) {
        JsonObject maintAndInsur = order.get("maintenanceAndInsurance").getAsJsonObject();

        this.type = order.get("type").getAsString();
        this.vin = order.get("vin").getAsString();
        this.make = order.get("make").getAsString();
        this.model = order.get("model").getAsString();
        this.color = order.get("color").getAsString();

        this.year = order.get("year").getAsInt();
        this.wheels = order.get("wheels").getAsInt();
        this.mileage = order.get("mileage").getAsInt();
        this.fuel = order.get("fuel").getAsInt();

        this.price = order.get("price").getAsBigDecimal();
        this.costToDealership = order.get("costToDealership").getAsBigDecimal();

        this.lastInsured = Date.from(Instant.parse(maintAndInsur.get("lastInsured").getAsString()));
        this.lastServiced = Date.from(Instant.parse(maintAndInsur.get("lastServiced").getAsString()));

        this.clean = order.get("clean").getAsBoolean();

        this.description = this.year + " " + this.make + " " + this.model + " with only " + this.mileage + " miles";
    }

    // Check fuel level
    public boolean checkFuel() {
        if (this.fuel < 5) {
            System.out.println("Vehicle low on fuel");
        }

        return this.fuel > 5;
    }

    // Test drive vehicle
    public void testDrive(int miles) {
        if (miles > 5) {
            this.mileage += miles;
            this.fuel -= Math.ceil(miles / 10);
        }

        System.out.println("Vehicle test-driven");
    }

    // Builder Class
    public static class Builder {
        private String type, vin, make, model, color, description;
        private int year, wheels, mileage, fuel;
        private BigDecimal price, costToDealership;
        private Date lastInsured, lastServiced;
        private boolean clean;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder vin(String vin) {
            this.vin = vin;
            return this;
        }
        public Builder make(String make) {
            this.make = make;
            return this;
        }
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public Builder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }
        public Builder fuel(int fuel) {
            this.fuel = fuel;
            return this;
        }
        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }
        public Builder costToDealership(BigDecimal costToDealership) {
            this.costToDealership = costToDealership;
            return this;
        }
        public Builder lastInsured(Date lastInsured) {
            this.lastInsured = lastInsured;
            return this;
        }
        public Builder lastServiced(Date lastServiced) {
            this.lastServiced = lastServiced;
            return this;
        }
        public Builder clean(boolean clean) {
            this.clean = clean;
            return this;
        }

        public Vehicle build() {
            Vehicle vehicle = new Vehicle();

            vehicle.type = this.type;
            vehicle.vin = this.vin;
            vehicle.make = this.make;
            vehicle.model = this.model;
            vehicle.color = this.color;
            vehicle.description = this.description;
            vehicle.year = this.year;
            vehicle.wheels = this.wheels;
            vehicle.mileage = this.mileage;
            vehicle.fuel = this.fuel;
            vehicle.price = this.price;
            vehicle.costToDealership = this.costToDealership;
            vehicle.lastInsured = this.lastInsured;
            vehicle.lastServiced = this.lastServiced;
            vehicle.clean = this.clean;

            return vehicle;
        }
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCostToDealership() {
        return costToDealership;
    }

    public void setCostToDealership(BigDecimal costToDealership) {
        this.costToDealership = costToDealership;
    }

    public Date getLastInsured() {
        return lastInsured;
    }

    public void setLastInsured(Date lastInsured) {
        this.lastInsured = lastInsured;
    }

    public Date getLastServiced() {
        return lastServiced;
    }

    public void setLastServiced(Date lastServiced) {
        this.lastServiced = lastServiced;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

}

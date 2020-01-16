package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Truck extends Vehicle {

    // Define subclass properties
    int mpg;

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    int towingCapacity;

    // Constructor (from JSON obj)
    public Truck(JsonObject order) {
        super(order);

        this.mpg = 15;
        this.towingCapacity = 20000;

        this.setWheels(8);
        this.setFuelCapacity(65);
    }

}

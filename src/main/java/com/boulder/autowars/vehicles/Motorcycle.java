package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Motorcycle extends Vehicle {

    // Define subclass properties
    int mpg;

    // Constructor (from JSON obj)
    public Motorcycle(JsonObject order) {
        super(order);

        this.mpg = 50;

        this.setFuelCapacity(5);
        this.setWheels(2);
    }

}

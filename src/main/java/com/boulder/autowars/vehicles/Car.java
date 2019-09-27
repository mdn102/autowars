package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Car extends Vehicle {

    // Define subclass properties
    int mpg;

    // Constructor (from JSON obj)
    public Car(JsonObject order) {
        super(order);

        this.mpg = 25;
        this.setFuelCapacity(16);
    }

}

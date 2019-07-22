package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Motorcycle extends Vehicle {

    int mpg = 50,
        fuelCapacity = 5,
        wheels = 2;

    public Motorcycle() {
        super();
    }

    public Motorcycle(JsonObject order) {
        super(order);
    }

}

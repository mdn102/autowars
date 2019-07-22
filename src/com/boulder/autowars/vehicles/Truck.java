package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Truck extends Vehicle {

    int mpg = 15,
        fuelCapacity = 65,
        towingCapacity = 20000,
        wheels = 8;

    public Truck() {
        super();
    }

    public Truck(JsonObject order) {
        super(order);
    }

}

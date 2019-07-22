package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Car extends Vehicle {

    int mpg = 25,
        fuelCapacity = 16;

    public Car() {
        super();
    }

    public Car(JsonObject order) {
        super(order);
    }

}

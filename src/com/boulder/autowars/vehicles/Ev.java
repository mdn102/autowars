package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Ev extends Vehicle {

    int mpkWh = 5,
        fuelCapacity = 75;

    public Ev() {
        super();
    }

    public Ev(JsonObject order) {
        super(order);
    }

}

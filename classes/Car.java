package com.company;

public class Car extends Vehicle {
    private String type;

    public Car(String name, int moving, int gears, String type) {
        super(name, 70, 5);
        this.type = type;
    }
}

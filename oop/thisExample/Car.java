package oop.thisExample;

public class Car {
    String color;
    String model;
    int yearOfProduction;
    Proprity owner;

    void changeModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    void start() {
        System.out.println("Starting the car...");
    }
}

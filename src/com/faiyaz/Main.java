package com.faiyaz;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Benz");
        System.out.println("The model is "+car.getModel());

        car.setDoors(4);
        System.out.println("The number of doors are "+car.getDoors());

        car.setColour("Blue");
        System.out.println("The colour of the car is "+car.getColour());

        car.setWheels(4);
        System.out.println("The number of wheels are "+car.getWheels());

    }
}

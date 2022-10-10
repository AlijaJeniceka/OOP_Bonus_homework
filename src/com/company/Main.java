package com.company;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car(20);

        System.out.println("My car fuel in the beginning: " + newCar.getFuelLevel());
        newCar.addFuel(20);
        System.out.println("Now the fuel is " + newCar.getFuelLevel());

        newCar.addFuel(50);
        System.out.println("Now the fuel is " + newCar.getFuelLevel());

        newCar.drive(100);
        System.out.println("Fuel level now is: " + newCar.getFuelLevel());


        Car zeroCar = new Car(5);
        zeroCar.addFuel(-6);
        System.out.println("Now the fuel is " + zeroCar.getFuelLevel());

        zeroCar.drive(-5);
        System.out.println("Fuel level now is: " + zeroCar.getFuelLevel());

        zeroCar.addFuel(6);
        System.out.println("Now the fuel is " + zeroCar.getFuelLevel());

        zeroCar.drive(-5);
        System.out.println("Fuel level now is: " + zeroCar.getFuelLevel());

        zeroCar.drive(1);
        System.out.println("Fuel level now is: " + zeroCar.getFuelLevel());
        
    }
}

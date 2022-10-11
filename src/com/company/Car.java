package com.company;

public class Car {
    //fuel efficiency
    private double efficiency;
    //certain amount of fuel - initial fuel level is 0;
    private  double fuel = 0;

    //efficiency in constructor
    public Car(double efficiency) {
        this.efficiency = (efficiency < 0) ? 0 : efficiency;
    }

    //addFuel() to tank up
    public void addFuel(double addFuel){
        if (addFuel < 0)
            addFuel = 0;
        setFuel(fuel + addFuel);
    }

    //method drive - driving for a certain distance and reduce the fuel level
    public void drive(double distance){
        if (getFuelLevel() <=0){
            System.out.println("No fuel in the tank, you can't drive. ");
        }
        else if (distance < 0){
                distance = 0;
            System.out.println("Distance is negative that is impossible, " +
                    "in that case distance is set to zero or fuel efficiency is 0 or less, please check fuel efficiency.");
        }
        else if (efficiency <= 0){
            System.out.println("Fuel efficiency is 0 or less, please check fuel efficiency it should be bigger then 0.");
        }
        else
        setFuel(getFuelLevel() - distance/efficiency);
    }

    public double getFuelLevel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}


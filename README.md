# OOP_Bonus_homework

Implement a class Car with the following properties. A car has a certain fuel efficiency (measured in km/litre) and a certain amount of fuel in the fuel tank. 
The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, 
reducing the fuel level in the tank, and methods getFuelLevel, to return the current fuel level, and addFuel, to tank up. Sample usage:

Car myHybrid = new Car(30); // 30 km per litre

myHybrid.addFuel(20); // Tank 20 litres

myHybrid.drive(100); // Drive 100 km

System.out.println(myHybrid.getFuelLevel()); //Print fuel remaining

package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped("Black", 1, 0, 5);

        Semitruck eightTeen = new Semitruck("Blue", 2, 20, 50);

        Hovercraft drift = new Hovercraft("Green", 9, 12, 13);

        Car drive = new Car("Pink", 6, 4, 17);

        System.out.println("Moped: " + slowRide.getColor() + ", Fuel Capacity: " + slowRide.getFuelCapacity() + " gallon");
        System.out.println("Car: " + drive.getColor() + ", Passengers: " + drive.getNumberOfPassengers());
        System.out.println("SemiTruck: " + eightTeen.getColor() + ", Cargo Capacity: " + eightTeen.getCargoCapacity() + " lbs");
        System.out.println("Hovercraft: " + drift.getColor() + ", Passengers: " + drift.getNumberOfPassengers());

        }
    }

    /* You are able to access the Vehicle getters and setters without creating an instance of Vehicle
    *  because you are inheriting the fields of the Vehicle parent class.
    */

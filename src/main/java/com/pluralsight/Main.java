package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Black");
        slowRide.setFuelCapacity(7);
        slowRide.setNumberOfPassengers(8);
        slowRide.setCargoCapacity(11);

        Semitruck eightTeen = new Semitruck();
        eightTeen.setColor("Blue");
        eightTeen.setFuelCapacity(20);
        eightTeen.setNumberOfPassengers(2);
        eightTeen.setCargoCapacity(50);

        Hovercraft drift = new Hovercraft();
        drift.setColor("Green");
        drift.setFuelCapacity(9);
        drift.setNumberOfPassengers(12);
        drift.setCargoCapacity(13);

        Car drive = new Car();
        drive.setColor("Blue");
        drive.setFuelCapacity(6);
        drive.setNumberOfPassengers(4);
        drive.setCargoCapacity(17);

        System.out.println("Moped: " + slowRide.getColor() + ", Fuel Capacity: " + slowRide.getFuelCapacity() + " gal");
        System.out.println("Car: " + drive.getColor() + ", Passengers: " + drive.getNumberOfPassengers());
        System.out.println("SemiTruck: " + eightTeen.getColor() + ", Cargo Capacity: " + eightTeen.getCargoCapacity() + " lbs");
        System.out.println("Hovercraft: " + drift.getColor() + ", Passengers: " + drift.getNumberOfPassengers());

        }
    }

    /* You are able to access the Vehicle getters and setters without creating an instance of Vehicle
    *  because you are inheriting the fields of the Vehicle parent class.
    */

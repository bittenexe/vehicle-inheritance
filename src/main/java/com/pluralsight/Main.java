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
        eightTeen.setFuelCapacity(7);
        eightTeen.setNumberOfPassengers(8);
        eightTeen.setCargoCapacity(11);

        Hovercraft drift = new Hovercraft();
        drift.setColor("Green");
        drift.setFuelCapacity(7);
        drift.setNumberOfPassengers(8);
        drift.setCargoCapacity(11);

        }
    }

    /* You are able to access the Vehicle getters and setters without creating an instance of Vehicle
    *  because you are inheriting the fields of the Vehicle parent class.
    */

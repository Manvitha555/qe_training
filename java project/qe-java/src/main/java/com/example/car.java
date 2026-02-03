package com.example;

public class Car {

    private String color;
    private String transmission;
    private int make;
    private int tyres;
    private int doors;

    public Car(String color, String transmission, int make) {
        this.color = color;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics() {
        System.out.println("Car Characteristics");
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    public static void main(String[] args) {
        Car carName = new Car("Black", "Manual", 2014);
        carName.displayCharacteristics();
    }
}

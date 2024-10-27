/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Friends com
 */class Helicopter implements Flyable {
    private String model;

    // Constructor
    public Helicopter(String model) {
        this.model = model;
    }

    // Implementation of fly() method from Flyable interface
    @Override
    public void fly() {
        System.out.println(model + " is flying in the sky.");
    }
}

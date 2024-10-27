/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Friends com
 */
class AmphibiousVehicle implements Driveable, Flyable {
    private String model;

    // Constructor
    public AmphibiousVehicle(String model) {
        this.model = model;
    }

    // Implementation of drive() method from Driveable interface
    @Override
    public void drive() {
        System.out.println(model + " is driving on both land and water.");
    }

    // Implementation of fly() method from Flyable interface
    @Override
    public void fly() {
        System.out.println(model + " is also capable of flying.");
    }
}
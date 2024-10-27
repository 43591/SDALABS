/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Friends com
 */
class Car implements Driveable {
    private String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }

    // Implementation of drive() method from Driveable interface
    @Override
    public void drive() {
        System.out.println(model + " is driving on the road.");
    }
}

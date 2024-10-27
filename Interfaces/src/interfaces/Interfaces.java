/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author Friends com
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Car object
        Car myCar = new Car("Tesla Model S");
        myCar.drive();   // Calls drive() method from Driveable interface

        System.out.println();  // For spacing in output

        // Create a Helicopter object
        Helicopter myHelicopter = new Helicopter("Apache AH-64");
        myHelicopter.fly();    // Calls fly() method from Flyable interface

        System.out.println();  // For spacing in output

        // Create an AmphibiousVehicle object
        AmphibiousVehicle myAmphibiousVehicle = new AmphibiousVehicle("AmphiX");
        myAmphibiousVehicle.drive();   // Calls drive() method from Driveable interface
        myAmphibiousVehicle.fly();     // Calls fly() method from Flyable interface
    }
    }
    


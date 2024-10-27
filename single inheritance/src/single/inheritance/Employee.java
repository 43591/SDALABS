/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single.inheritance;

/**
 *
 * @author Friends com
 */
public class Employee {
    String name;
    int salary;
    
    public void work() {
        System.out.println(name + " is working");
}
}



/*
2nd Example
// Base (Parent) Class
class Animal {
    // This is a method in the parent class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Another method in the parent class
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived (Child) Class
class Dog extends Animal {
    // The Dog class inherits the makeSound() and eat() methods from the Animal class

    // This is an additional method specific to the Dog class
    public void bark() {
        System.out.println("Dog barks");
    }

    // This method overrides the inherited makeSound() method to give a custom message
    @Override
    public void makeSound() {
        System.out.println("Dog makes a sound: Woof Woof!");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Call the overridden method from the Dog class
        myDog.makeSound();  // This will call the overridden version in Dog class
        myDog.eat();        // This will call the inherited method from the Animal class
        myDog.bark();       // This is defined in Dog class
    }
}
*/
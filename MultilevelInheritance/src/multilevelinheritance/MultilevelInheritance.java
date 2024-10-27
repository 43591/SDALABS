/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilevelinheritance;

/**
 *
 * @author Friends com
 */
public class MultilevelInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SeniorManager seniorMgr = new SeniorManager();
        seniorMgr.name = "Bob";
        seniorMgr.salary = 120000;
        seniorMgr.teamSize = 20;
        seniorMgr.budget = 500000;

        seniorMgr.work(); // Inherited from Employee
        seniorMgr.conductMeeting(); // Inherited from Manager
        seniorMgr.approveBudget(); // Specific to SeniorManager
    }
    
}
/*// Grandparent (Base) Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
    
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Parent (Intermediate) Class
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
    
    // Override the sleep method
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Child (Derived) Class
class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }

    // Override the bark method
    @Override
    public void bark() {
        System.out.println("Puppy is barking softly");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of the Puppy class
        Puppy myPuppy = new Puppy();
        
        // Call methods inherited from Animal, Dog, and methods of Puppy
        myPuppy.eat();   // Inherited from Animal class
        myPuppy.sleep(); // Overridden in Dog class, inherited by Puppy class
        myPuppy.bark();  // Overridden in Puppy class
        myPuppy.weep();  // Defined in Puppy class
    }
}
Output
Animal is eating
Dog is sleeping
Puppy is barking softly
Puppy is weeping
*/
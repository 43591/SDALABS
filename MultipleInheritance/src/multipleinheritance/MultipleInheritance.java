/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multipleinheritance;

/**
 *
 * @author Friends com
 */
public class MultipleInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog myDog = new Dog();
        
        // Call methods implemented from the interfaces
        myDog.eat();   // From Animal interface
        myDog.play();  // From Pet interface
        myDog.bark();  // Specific to Dog class
    }
    
}
/*Multiple inheritance means that a class can inherit features (like methods and properties) from more than one parent class. 
This allows a class to have the functionality of multiple parent classes at the same time*,this we do by inherit multiple interfaces*/
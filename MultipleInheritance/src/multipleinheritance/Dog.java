/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleinheritance;

/**
 *
 * @author Friends com
 */
public class Dog implements Animal,Pet{
   // Implementing the eat() method from Animal interface
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    // Implementing the play() method from Pet interface
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
    
    // A unique method specific to Dog class
    public void bark() {
        System.out.println("Dog is barking");
    } 

   
}

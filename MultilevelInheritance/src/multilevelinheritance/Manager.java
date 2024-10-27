/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilevelinheritance;

/**
 *
 * @author Friends com
 */
public class Manager extends Employee{
     int teamSize;

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting with a team of " + teamSize);
    }
}

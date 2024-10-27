/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package single.inheritance;

/**
 *
 * @author Friends com
 */
public class SingleInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager mgr = new Manager();
        mgr.name = "Alice";
        mgr.salary = 90000;
        mgr.teamSize = 10;
        
        mgr.work(); // Inherited from Employee
        mgr.conductMeeting(); // Specific to Manager
    }
    
}

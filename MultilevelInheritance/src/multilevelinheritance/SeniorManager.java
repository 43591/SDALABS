/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilevelinheritance;

/**
 *
 * @author Friends com
 */
public class SeniorManager extends Manager
{
    int budget;

    public void approveBudget() {
        
        System.out.println(name + " is approving a budget of " + budget);
    }
}

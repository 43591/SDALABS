/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package purefabrication;

/**
 *
 * @author Friends com
 */
public class NotificationService {
    
    public void sendDueDateReminder(LibraryMember member, Book book) {
        // Simulating sending a reminder notification
        System.out.println("Reminder: " + member.getName() + ", the book '" 
                           + book.getTitle() + "' is due soon!");
    }
}

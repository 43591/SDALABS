/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purefabrication;

/**
 *
 * @author Friends com
 */
public class PureFabrication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Create book and library member objects
        Book book = new Book("1984");
        LibraryMember member = new LibraryMember("Alice");
        
        // Create NotificationService to send a reminder
        NotificationService notificationService = new NotificationService();
        
        // Send reminder
        notificationService.sendDueDateReminder(member, book);
    }
}

   

/*Another Example

// Class to represent a Student
class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending the class.");
    }

    public String getEmail() {
        return email;
    }
}

// Class to represent a Course
class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public void conductClass() {
        System.out.println("Conducting class for " + title + ".");
    }
}

// Pure Fabrication class to manage notifications
class NotificationManager {
    public static void sendNotification(Student student, String message) {
        System.out.println("Sending notification to " + student.getEmail() + ": " + message);
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        // Create a student and a course
        Student student1 = new Student("Alice", "alice@example.com");
        Course course1 = new Course("Mathematics");

        // Student studies and attends class
        student1.study();
        student1.attendClass();
        course1.conductClass();

        // Send a notification to the student
        NotificationManager.sendNotification(student1, "Don't forget about your math exam next week!");
    }
}
*/


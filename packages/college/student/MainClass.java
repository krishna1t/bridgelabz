package college;

import college.student.Student;
import college.faculty.Faculty;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul Sharma", 101);
        Faculty f1 = new Faculty("Dr. Mehta", "Computer Science");

        System.out.println("=== Student Details ===");
        s1.displayDetails();

        System.out.println("\n=== Faculty Details ===");
        f1.displayDetails();
    }
}

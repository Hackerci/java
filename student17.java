
//~ Consider a class Student having data members name, marks of three subjects, average and member function printDetails(). Take input of 3 students from user using array of objects and print it.
import java.util.*;

class Student {
    String name;
    int marks1;
    int marks2;
    int marks3;
    float average;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks in LDCO: " + marks1);
        System.out.println("Marks in OOP: " + marks2);
        System.out.println("Marks in DSA: " + marks3);
        System.out.println("Average: " + average);
    }
}

public class chit17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of objects
        Student[] students = new Student[3];

        // Read input for each student
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("Enter name of student " + (i + 1) + ": ");
            s.name = sc.nextLine();
            System.out.println("Enter marks in LDCO: ");
            s.marks1 = sc.nextInt();
            System.out.println("Enter marks in OOP: ");
            s.marks2 = sc.nextInt();
            System.out.println("Enter marks in DSA: ");
            s.marks3 = sc.nextInt();
            sc.nextLine();
            s.average = (s.marks1 + s.marks2 + s.marks3) / 3.0f;
            students[i] = s;
        }

        // Print details of each student
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of student " + (i + 1) + ": ");
            students[i].printDetails();
        }
    }
}

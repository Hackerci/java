//~ Implement a program for maintaining a database of student records using Files. Student has Student_id,name, Roll_no, Class, marks and address. Display the data for few students.
//^• Create Database • Display Database • Delete Records • Update Record • Search Record

import java.io.*;
import java.util.Scanner;

class Student {
    // fields for student details
    int studentId;
    String name;
    int rollNo;
    String className;
    int marks;
    String address;
}

public class chit8 {
    // method to create a new student record
    public static void createRecord(Student student) throws IOException {
        // open the file in append mode
        FileWriter fw = new FileWriter("students.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        // write the student details to the file
        pw.println(student.studentId);
        pw.println(student.name);
        pw.println(student.rollNo);
        pw.println(student.className);
        pw.println(student.marks);
        pw.println(student.address);

        // close the file
        pw.close();
    }

    // method to display the student records
    public static void displayRecords() throws IOException {
        // open the file in read mode
        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            // read the student details from the file and print them
            int studentId = Integer.parseInt(line);
            String name = br.readLine();
            int rollNo = Integer.parseInt(br.readLine());
            String className = br.readLine();
            int marks = Integer.parseInt(br.readLine());
            String address = br.readLine();

            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Class: " + className);
            System.out.println("Marks: " + marks);
            System.out.println("Address: " + address);
            System.out.println();
        }

        // close the file
        br.close();
    }

    // method to delete a student record
    public static void deleteRecord(int studentId) throws IOException {
        // create a temporary file
        File tempFile = new File("temp.txt");

        // open the original file in read mode and the temporary file in write mode
        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(tempFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        String line;
        while ((line = br.readLine()) != null) {
            int id = Integer.parseInt(line);
            if (id != studentId) {
                // if the student ID does not match, write the record to the temporary file
                pw.println(line);
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
            } else {
                // if the student ID matches, skip the record
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
            }
        }
        // close the files
        pw.close();
        br.close();

        // delete the original file
        File originalFile = new File("students.txt");
        originalFile.delete();

        // rename the temporary file to the original file
        tempFile.renameTo(originalFile);
    }

    // method to update a student record
    public static void updateRecord(int studentId, Student updatedStudent) throws IOException {
        // create a temporary file
        File tempFile = new File("temp.txt");
        // open the original file in read mode and the temporary file in write mode
        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(tempFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        String line;
        while ((line = br.readLine()) != null) {
            int id = Integer.parseInt(line);
            if (id == studentId) {
                // if the student ID matches, write the updated student details to the temporary
                // file
                pw.println(updatedStudent.studentId);
                pw.println(updatedStudent.name);
                pw.println(updatedStudent.rollNo);
                pw.println(updatedStudent.className);
                pw.println(updatedStudent.marks);
                pw.println(updatedStudent.address);
            } else {
                // if the student ID does not match, write the original record to the temporary
                // file
                pw.println(line);
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
                pw.println(br.readLine());
            }
        }

        // close the files
        pw.close();
        br.close();

        // delete the original file
        File originalFile = new File("students.txt");
        originalFile.delete();

        // rename the temporary file to the original file
        tempFile.renameTo(originalFile);
    }

    // method to search for a student record
    public static void searchRecord(int studentId) throws IOException {
        // open the file in read mode
        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        boolean found = false;
        while ((line = br.readLine()) != null) {
            int id = Integer.parseInt(line);
            if (id == studentId) {
                // if the student ID matches, print the student details
                String name = br.readLine();

                int rollNo = Integer.parseInt(br.readLine());
                String className = br.readLine();
                int marks = Integer.parseInt(br.readLine());
                String address = br.readLine();
                System.out.println("Student ID: " + studentId);
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + rollNo);
                System.out.println("Class: " + className);
                System.out.println("Marks: " + marks);
                System.out.println("Address: " + address);
                System.out.println();

                found = true;
                break;
            } else {
                // if the student ID does not match, skip the record
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
                br.readLine();
            }
        }

        // close the file
        br.close();

        if (!found) {
            System.out.println("No student found with ID: " + studentId);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // display the options
            System.out.println("1. Create a new student record");
            System.out.println("2. Display all student records");
            System.out.println("3. Delete a student record");
            System.out.println("4. Update a student record");
            System.out.println("5. Search for a student record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // to consume the newline character

            if (choice == 1) {
                // create a new student record
                System.out.print("Enter student ID: ");
                int studentId = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter roll no: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter class: ");
                String className = sc.nextLine();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter address: ");
                String address = sc.nextLine();

                Student student = new Student();
                student.studentId = studentId;
                student.name = name;
                student.rollNo = rollNo;
                student.className = className;
                student.marks = marks;
                student.address = address;

                createRecord(student);
                System.out.println("Student record created successfully!");
            } else if (choice == 2) {
                // display all student records
                displayRecords();
            } else if (choice == 3) {
                // delete a student record
                System.out.print("Enter student ID: ");
                int studentId = sc.nextInt();
                deleteRecord(studentId);
                System.out.println("Student record deleted successfully!");
            } else if (choice == 4) {
                // update a student record
                System.out.print("Enter student ID: ");
                int studentId = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter roll no: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter class: ");
                String className = sc.nextLine();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine(); // to consume the newline character
                System.out.print("Enter address: ");
                String address = sc.nextLine();
                Student updatedStudent = new Student();
                updatedStudent.studentId = studentId;
                updatedStudent.name = name;
                updatedStudent.rollNo = rollNo;
                updatedStudent.className = className;
                updatedStudent.marks = marks;
                updatedStudent.address = address;

                updateRecord(studentId, updatedStudent);
                System.out.println("Student record updated successfully!");
            } else if (choice == 5) {
                // search for a student record
                System.out.print("Enter student ID: ");
                int studentId = sc.nextInt();
                searchRecord(studentId);
            } else if (choice == 6) {
                // exit the program
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}

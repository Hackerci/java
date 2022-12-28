//~Define a class student with four data members such as name, roll no, sub1 and sub2. Define appropriate methods to INITITALIZE AND DISPLAY VALUES OF DATA MEMBERS also calculate total marks and percentage scored by student in three subjects.

class Student {
    // data members
    private String name;
    private int rollNo;
    private double sub1;
    private double sub2;

    // Constructor to initialize data members
    public Student(String name, int rollNo, double sub1, double sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    // Method to display values of data members
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in subject 1: " + sub1);
        System.out.println("Marks in subject 2: " + sub2);
    }

    // Method to calculate total marks
    public double totalMarks() {
        return sub1 + sub2;
    }

    // Method to calculate percentage scored
    public double percentage() {
        return totalMarks() / 2;
    }
}

public class chit13 {
    public static void main(String[] args) {

        Student s = new Student("Saiee", 1, 85.5, 90.0);
        s.display();
        double total = s.totalMarks();
        double percentage = s.percentage();
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);

    }
}
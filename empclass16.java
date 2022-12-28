//~Create a class Employee having data members empID, name, salary and experience. Using array of objects print the above data

class Employee {
    // data members
    private int empID;
    private String name;
    private double salary;
    private int experience;

    // constructor to initialize data members
    public Employee(int empID, String name, double salary, int experience) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    // getter and setter methods for data members
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

public class chit16 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "Pratik", 35000, 5);
        employees[1] = new Employee(2, "Prathmesh", 40000, 3);
        employees[2] = new Employee(3, "Manish", 45000, 7);
        employees[3] = new Employee(4, "Akshay", 50000, 10);
        employees[4] = new Employee(5, "Vaibhav", 55000, 2);

        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getEmpID() + ", Name: " + employee.getName() + ", Salary: "
                    + employee.getSalary() + ", Experience: " + employee.getExperience());
        }

    }
}

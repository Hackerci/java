//~Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers, the program would throw a Number Format Exception. If Num2 were zero, the program would throw an Arithmetic Exception. Display the exception.

import java.util.Scanner;

public class chit6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Num1: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Num2: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Division operation may throw an ArithmeticException if num2 is zero
            int result = num1 / num2;

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            // This exception is thrown if num1 or num2 are not integers
            System.out.println("Number Format Exception: Both Num1 and Num2 must be integers.");
        } catch (ArithmeticException e) {
            // This exception is thrown if num2 is zero
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        } catch (Exception e) {
            // This catch block will handle any other exceptions not caught above
            System.out.println("An unknown exception occurred: " + e.getMessage());
        }
    }
}

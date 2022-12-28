//~Write a program to check of candidate, if the age is less than 18 throw ‘AgeExceptionFailure’ exception else allow candidate for voting.
import java.util.Scanner;

public class chit12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age of the candidate: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new AgeExceptionFailure("Candidate is too young to vote.");
            } else {
                System.out.println("Candidate is eligible to vote.");
            }
        } catch (AgeExceptionFailure ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class AgeExceptionFailure extends Exception {
    public AgeExceptionFailure(String message) {
        super(message);
    }
}

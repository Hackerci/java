//~Write a program to accept the password from user and throw ‘AuthenticationFailure’ exception if the password is incorrect.

import java.util.Scanner;

public class chit11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    try {
      if (!password.equals("password")) {
        throw new AuthenticationFailure("Incorrect password");
      }
      System.out.println("Authentication successful");
    } catch (AuthenticationFailure e) {
      System.out.println(e.getMessage());
    }
  }
}

class AuthenticationFailure extends Exception {
  public AuthenticationFailure(String message) {
    super(message);
  }
}

//~ Using concepts of Object-Oriented programming develop solution for any one application 1) Banking system having following operations :
//^1. Create an account 2. Deposit money 3. Withdraw money 4. Honor daily withdrawal limit 5. Check the balance 6. Display Account information.

import java.util.Scanner;

public class chit9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Enter 1 to create an account");
            System.out.println("Enter 2 to deposit money");
            System.out.println("Enter 3 to withdraw money");
            System.out.println("Enter 4 to check the balance");
            System.out.println("Enter 5 to display account information");
            System.out.println("Enter 6 to exit");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter account name: ");
                    String name = input.next();
                    System.out.println("Enter initial deposit: ");
                    double deposit = input.nextDouble();
                    bank.createAccount(name, deposit);
                    break;
                case 2:
                    System.out.println("Enter account name: ");
                    name = input.next();
                    System.out.println("Enter amount to be deposited: ");
                    deposit = input.nextDouble();
                    bank.deposit(name, deposit);
                    break;
                case 3:
                    System.out.println("Enter account name: ");
                    name = input.next();
                    System.out.println("Enter amount to be withdrawn: ");
                    double withdrawal = input.nextDouble();
                    bank.withdraw(name, withdrawal);
                    break;
                case 4:
                    System.out.println("Enter account name: ");
                    name = input.next();
                    bank.checkBalance(name);
                    break;
                case 5:
                    System.out.println("Enter account name: ");
                    name = input.next();
                    bank.displayAccountInfo(name);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class Bank {
    private static final int DAILY_WITHDRAWAL_LIMIT = 1000;
    private Account[] accounts;
    private int numAccounts;

    public Bank() {
        accounts = new Account[10];
        numAccounts = 0;
    }

    public void createAccount(String name, double deposit) {
        accounts[numAccounts] = new Account(name, deposit);
        System.out.println("Account created successfully.");
        numAccounts++;
    }

    public void deposit(String name, double amount) {
        Account account = getAccount(name);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String name, double amount) {
        Account account = getAccount(name);
        if (account != null) {
            if (amount <= DAILY_WITHDRAWAL_LIMIT) {

                if (account.getBalance() >= amount) {
                    account.withdraw(amount);
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Exceeded daily withdrawal limit.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String name) {
        Account account = getAccount(name);
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountInfo(String name) {
        Account account = getAccount(name);
        if (account != null) {
            System.out.println("Name: " + account.getName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private Account getAccount(String name) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getName().equals(name)) {
                return accounts[i];
            }
        }
        return null;
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

/* Write a program to implement the following Multi Level Inheritance:
Class: Account
Cust_name , acc_no
Class: Saving_Acc
Min_bal, saving_bal
Class:Acct_Details
Deposits, withdrawals
*/
class Account {
    // instance variables
    private String custName;
    private int accNo;

    // constructor
    public Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }

    // getters and setters for instance variables
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}

class SavingAcc extends Account {
    // instance variables
    private double minBal;
    private double savingBal;

    // constructor
    public SavingAcc(String custName, int accNo, double minBal, double savingBal) {
        super(custName, accNo);
        this.minBal = minBal;
        this.savingBal = savingBal;
    }

    // getters and setters for instance variables
    public double getMinBal() {
        return minBal;
    }

    public void setMinBal(double minBal) {
        this.minBal = minBal;
    }

    public double getSavingBal() {
        return savingBal;
    }

    public void setSavingBal(double savingBal) {
        this.savingBal = savingBal;
    }
}

class AcctDetails extends SavingAcc {
    // instance variables
    private double deposits;
    private double withdrawals;

    // constructor
    public AcctDetails(String custName, int accNo, double minBal, double savingBal, double deposits,
            double withdrawals) {
        super(custName, accNo, minBal, savingBal);
        this.deposits = deposits;
        this.withdrawals = withdrawals;
    }

    // getters and setters for instance variables
    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(double withdrawals) {
        this.withdrawals = withdrawals;
    }
}

public class chit15 {
    public static void main(String[] args) {
        AcctDetails acct = new AcctDetails("Narendra Modi", 12345, 1000.0, 5000.0, 500.0, 200.0);

        // print account details
        System.out.println("Customer name: " + acct.getCustName());
        System.out.println("Account number: " + acct.getAccNo());
        System.out.println("Minimum balance: " + acct.getMinBal());
        System.out.println("Saving balance: " + acct.getSavingBal());
        System.out.println("Total deposits: " + acct.getDeposits());
        System.out.println("Total withdrawals: " + acct.getWithdrawals());

    }
}

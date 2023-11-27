// Q2) Write a program to define a class Account having members custname, accno. Define default 
//  and parameterized constructor. Create a subclass called SavingAccount with member savingbal, 
//  minbal. Create a derived class AccountDetail that extends the class SavingAccount with 
//  members, depositamt and withdrawalamt. Write a appropriate method to display customer 
//  details.


class Account {
    String custName;
    int accNo;

    // Default constructor
    public Account() {
        custName = "DefaultName";
        accNo = 0;
    }

    // Parameterized constructor
    public Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }

    // Display method for customer details
    public void displayDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
    }
}

class SavingAccount extends Account {
    double savingBal;
    double minBal;

    // Default constructor
    public SavingAccount() {
        super(); // Invoke the default constructor of the superclass (Account)
        savingBal = 0.0;
        minBal = 0.0;
    }

    // Parameterized constructor
    public SavingAccount(String custName, int accNo, double savingBal, double minBal) {
        super(custName, accNo); // Invoke the parameterized constructor of the superclass (Account)
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

class AccountDetail extends SavingAccount {
    double depositAmt;
    double withdrawalAmt;

    // Default constructor
    public AccountDetail() {
        super(); // Invoke the default constructor of the superclass (SavingAccount)
        depositAmt = 0.0;
        withdrawalAmt = 0.0;
    }

    // Parameterized constructor
    public AccountDetail(String custName, int accNo, double savingBal, double minBal, double depositAmt,
            double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal); // Invoke the parameterized constructor of the superclass
                                                   // (SavingAccount)
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    // Display method to show all details
    public void displayAllDetails() {
        super.displayDetails(); // Display customer details from the superclass
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the derived class (AccountDetail)
        AccountDetail account1 = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 500.0);

        // Displaying all details
        account1.displayAllDetails();
    }
}

// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\15> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\15\" ; if ($?) { javac Main.java } ; if ($?) 
// { java Main }
// Customer Name: John Doe
// Account Number: 123456
// Saving Balance: 5000.0
// Minimum Balance: 1000.0
// Deposit Amount: 2000.0
// Withdrawal Amount: 500.0
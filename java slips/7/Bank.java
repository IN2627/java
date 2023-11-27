// Slip7_1: Design a class for Bank. Bank Class should support following operations; 
// a. Deposit a certain amount into an account 
// b. Withdraw a certain amount from an account 
// c. Return a Balance value specifying the amount with details

class Bank {
    private double balance;

    public Bank() {
        balance = 0;
    }

    public Bank(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank b = new Bank(1000);
        b.withdraw(250);
        System.out.println("the withdraw is:" + b.balance);
        b.deposit(400);
        System.out.println("the deposit is:" + b.balance);
        System.out.println("the balance is:" + b.getBalance());
    }
}

// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\6> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\7\" ; if ($?) { javac Bank.java } ; if ($?) { java Bank }
// the withdraw is:750.0
// the deposit is:1150.0
// the balance is:1150.0
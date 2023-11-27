// Slip17_1: Design a Super class Customer (name, phone-number). Derive a class 
// Depositor(accno , balance) from Customer. Again, derive a class Borrower (loan-no, 
// loan-amt) from Depositor. Write necessary member functions to read and display the 
// details of ‘n’customers

import java.util.*;

class Customer {
    String name;
    int Pno;
}

class Depositer extends Customer {
    int accno;
    double bal;
}

class Borrower extends Depositer {
    int loanno;
    double loanamt;

    void read() {
        System.out.println("enter name, Phone number, accno, bal, loanno, loanamt");
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
        this.Pno = sc.nextInt();
        this.accno = sc.nextInt();
        this.bal = sc.nextDouble();
        this.loanno = sc.nextInt();
        this.loanamt = sc.nextDouble();
    }

    void display() {
        System.out.println("The details are:");
        System.out.println("name: " + this.name);
        System.out.println("phone number: " + this.Pno);
        System.out.println("accout number: " + this.accno);
        System.out.println("Balance: " + this.bal);
        System.out.println("loan number: " + this.loanno);
        System.out.println("loan amount: " + this.loanamt);
        System.out.println("------------------------------------");

    }

    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number:");
        int n = sc.nextInt();
        Borrower[] l = new Borrower[n];
        for (i = 0; i < n; i++) {
            l[i] = new Borrower();
            l[i].read();
        }
        for (i = 0; i < n; i++) {
            l[i].display();
        }
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\16> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\17\" ; if ($?) { javac Borrower.java } ; if ($?) { java Borrower }

// enter total number: 2

// enter name, Phone number, accno, bal, loanno, loanamt
// Altaf 98492340 94920432 79800 123930210 293000  

// enter name, Phone number, accno, bal, loanno, loanamt
// Prasad 93023234 23421235 34321 412343 123421

// The details are:
// name: Altaf     
// phone number: 98492340
// accout number: 94920432
// Balance: 79800.0      
// loan number: 123930210
// loan amount: 293000.0 
// ------------------------------------
// The details are:
// name: Prasad
// phone number: 93023234
// accout number: 23421235
// Balance: 34321.0
// loan number: 412343
// loan amount: 123421.0
// Slip27_1: Define an Employee class with suitable attributes having getSalary() method, 
// which returns salary withdrawn by a particular employee. Write a class Manager which 
// extends a class Employee, override the getSalary() method, which will return salary of 
// manager by adding traveling allowance, house rent allowance etc.

import java.util.*;

class Employee {
    int BasicSalary = 35000;

    public void getSalary() {
        System.out.println("Employee Salary:" + BasicSalary);
    }
}

class Manager extends Employee {
    int traveling = 2000;
    int rent = 5000;

    public void getSalary() {

        System.out.println("Manager Salary:" + (BasicSalary + traveling + rent));
        System.out.println("Basic Salary:" + BasicSalary);
        System.out.println("Travaling Allowance:" + traveling);
        System.out.println("House rent:" + rent);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Employee Salary and 0 for Manager");
        int ch = sc.nextInt();
        if (ch == 1) {
            Employee Eob = new Employee();
            Eob.getSalary();
        } else if (ch == 0) {
            Manager Mob = new Manager();
            Mob.getSalary();
        } else
            System.out.println("Entered Wrong Choice");

    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\26> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\27\" ; if ($?) { javac Manager.java } ; if ($?) { java Manager }
// Press 1 for Employee Salary and 0 for Manager
// 1
// Employee Salary:35000

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\27> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\27\" ; if ($?) { javac Manager.java } ; if ($?) { java Manager }
// Press 1 for Employee Salary and 0 for Manager
// 0
// Manager Salary:42000
// Basic Salary:35000
// Travaling Allowance:2000
// House rent:5000
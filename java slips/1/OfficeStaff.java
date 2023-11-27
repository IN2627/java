// Slip 1_2: Define an abstract class Staff with protected members id and name. Define a parameterized 
// constructor. Define one subclass OfficeStaff with member department. Create n objects of 
// OfficeStaff and display all details.

import java.util.*;

abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String dept;

    OfficeStaff(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    public void display() {
        System.out.println("ID :" + id + " Name :" + name + " Department :" + dept);
    }

    public static void main(String args[]) {
        int n, id;
        String name, dept;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many staff members?");
        n = sc.nextInt();
        OfficeStaff ob[] = new OfficeStaff[n];
        System.out.println("Enter details of " + n + " staff");
        for (int i = 0; i < n; i++) {

            System.out.println("Enter id,name, department");
            id = sc.nextInt();
            name = sc.next();
            dept = sc.next();
            ob[i] = new OfficeStaff(id, name, dept);
        }
        System.out.println("Entered Details are\n");
        for (int i = 0; i < n; i++) {
            ob[i].display();
        }
    }
}

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\1> javac OfficeStaff.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\1> java OfficeStaff
// How many staff members?
// 3
// Enter details of 3 staff
// Enter id,name, department
// 101 Altaf CS
// Enter id,name, department
// 102 Saif CA
// Enter id,name, department
// 103 Rohit BSC
// Entered Details are

// ID :101 Name :Altaf Department :CS
// ID :102 Name :Saif Department :CA
// ID :103 Name :Rohit Department :BSC
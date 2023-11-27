
// Slip30_1: Write program to define class Person with data member as 
// Personname,Aadharno, Panno. Accept information for 5 objects and display appropriate 
// information (use this keyword). 
import java.util.*;

class person {
    String Personname;
    int Adharno, Panno;

    public void display() {
        System.out.println("Name of the Person:" + Personname + " " + "Adhar number is: " + Adharno + " "
                + "Pan numberis:" + Panno);
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the person:");
        Personname = sc.next();
        System.out.println("Enter Adhar number of the person:");
        Adharno = sc.nextInt();
        System.out.println("Enter Pan number of the person:");
        Panno = sc.nextInt();
    }

    public static void main(String args[]) {
        int i;
        person ob = new person();
        for (i = 1; i <= 5; i++) {
            ob.accept();
            ob.display();
        }
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\30> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\30\" ; if ($?) { javac person.java } ; if ($?) { java person }

// Enter name of the person:
// Altaf
// Enter Adhar number of the person:
// 123456
// Enter Pan number of the person:
// 1234
// Name of the Person:Altaf Adhar number is: 123456 Pan numberis:1234
// Enter name of the person:
// Rahul
// Enter Adhar number of the person:
// 123456
// Enter Pan number of the person:
// 123
// Name of the Person:Rahul Adhar number is: 123456 Pan numberis:123
// Enter name of the person:
// Saif
// Enter Adhar number of the person:
// 12345
// Enter Pan number of the person:
// 1234
// Name of the Person:Saif Adhar number is: 12345 Pan numberis:1234
// Enter name of the person:
// Rohit
// Enter Adhar number of the person:
// 123456
// Enter Pan number of the person:
// 1234567
// Name of the Person:Rohit Adhar number is: 123456 Pan numberis:1234567
// Enter name of the person:
// Viren
// Enter Adhar number of the person:
// 123456
// Enter Pan number of the person:
// 12345
// Name of the Person:Viren Adhar number is: 123456 Pan numberis:12345
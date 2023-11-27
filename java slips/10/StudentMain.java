
// Main File 
import student.StudentPer;
import java.util.*;
import java.lang.*;
import java.io.*;

class StudentMain {
    public static void main(String[] args) {
        String nm, clas;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no:= ");
        roll = sc.nextInt();
        System.out.print("Enter Name:= ");
        nm = sc.next();
        System.out.print("Enter class:= ");
        clas = sc.next();

        int m1, m2, m3, m4, m5, m6;
        System.out.print("Enter 6 sub mark:= ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        m6 = sc.nextInt();

        StudentPer s = new StudentPer(roll, nm, clas, m1, m2, m3, m4, m5, m6);
        s.display();
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\10\student> javac StudentPer.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\10> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\10\" ; if ($?) { javac StudentMain.java } ; if ($?) { java StudentMain }
// Enter Roll no:= 1
// Enter Name:= Altaf
// Enter class:= 4 
// Enter 6 sub mark:= 90
// 80
// 60
// 80
// 99
// 100
// Roll_no : 1
// Name : Altaf
// class :4
// -----MARKS-------
// Sub 1 : 90
// Sub 2 : 80
// Sub 3 : 60
// Sub 4 : 80
// Sub 5 : 99
// Sub 6 : 100
// Total : 509
// percentage: 84.0
// ------------------
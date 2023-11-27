// Slip12_1: Write a program to create parent class College(cno, cname, caddr) and derived 
// class Department(dno, dname) from College. Write a necessary methods to display College 
// details. 

import java.util.*;

class college {
    int no;
    String name;
    String addr;

}

class Dept extends college {
    int dno;
    String dname;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("enter no");
        no = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter college address");
        addr = sc.next();
        System.out.println("enter depatrment no");
        dno = sc.nextInt();
        System.out.println("enter department name");
        dname = sc.next();
    }

    public void display() {
        System.out.println("college no" + no);
        System.out.println("college name" + name);
        System.out.println("college address" + addr);
        System.out.println("department number" + dno);
        System.out.println("department number" + dname);
    }

    public static void main(String a[]) {
        Dept ob = new Dept();
        ob.accept();
        ob.display();
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\11> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\12\" ; if ($?) { javac Dept.java } ; if ($?) 
// { java Dept }
// enter no
// 23
// enter name
// Altaf
// enter college address
// Akurdi
// enter depatrment no
// 101
// enter department name
// computer science
// college no23
// college nameAltaf
// college addressAkurdi
// department number101
// department numbercomputer
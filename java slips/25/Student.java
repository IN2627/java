// Slip25_1:Create a class Student(rollno, name ,class, per), to read student information 
// from the console and display them (Using BufferedReader class)

import java.io.*;

class Student {
    public static void main(String args[]) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter name:");
        String name = br.readLine();
        System.out.println("Enter roll no.:");
        String number = br.readLine();
        System.out.println("Enter percentage:");
        String marks = br.readLine();

        System.out.println("Enter class");
        String classname = br.readLine();

        System.out.println("name:" + name);
        System.out.println("Roll No.:" + number);
        System.out.println("Marks:" + marks);

        System.out.println("Class:" + classname);
    }
}

// Slip26_2: Define a class ‘Donor’ to store the below mentioned details of a blood donor. 
// name, age, address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects 
// of this class for all the regular donors at Pune. Write these objects to a file. Read these 
// objects from the file and display only those donors’ details whose blood group is ‘A+ve’ 
// and had not donated for the recent six months. 
import java.io.*;
import java.util.*;

class Donor {
    String name, address, group;
    int age, contact, lod;

    public Donor(String Name, String address, String group, int age, int contact, int lod) {
        this.name = Name;
        this.address = address;
        this.group = group;
        this.age = age;
        this.contact = contact;
        this.lod = lod;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many records you want");
        int n = s.nextInt();
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("save.txt"));
            Donor d[] = new Donor[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Name: ");
                String name = s.next();
                System.out.println("Age: ");
                int age = s.nextInt();
                System.out.println("Address: ");
                String address = s.next();
                System.out.println("Contact: ");
                String contact = s.next();
                System.out.println("Group: ");
                String group = s.next();
                System.out.println("Last donation: ");
                int lod = s.nextInt();
                o.writeObject(d[i]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            ObjectInputStream z = new ObjectInputStream(new FileInputStream("save.txt"));
            for (int i = 0; i < n; i++) {
                Donor d = (Donor) z.readObject();
                if (d.group.equals("A+ve") && d.lod >= 6)
                    System.out.println(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\26> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\26\" ; if ($?) { javac Donor.java } ; if ($?) { java Donor }
// Enter how many records you want
// 1
// Name: 
// rohit
// Age: 
// 21
// Address: 
// mumbai
// Contact: 
// 65432898765
// Group: 
// A+ve
// Last donation: 
// 21

// java.lang.NullPointerException: Cannot read field "group" because "<local5>" is null
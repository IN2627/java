// Slip6_1: Write a program to display the Employee(Empid, Empname, 
// mpdesignation, Empsal) information using toString(). 

class Emp {
    int id, salary;
    String name;
    String desig;

    Emp(int id, String name, int salary, String desig) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.desig = desig;
    }

    public String toString() // overrides toString() method
    {
        return id + " " + name + " " + salary + " " + desig;
    }

    public static void main(String args[]) {
        Emp E1 = new Emp(111, "Rakesh", 50000, "bsc cs");
        Emp E2 = new Emp(112, "Suresh", 25000, "msc cs");
        System.out.println("Employee details: " + E1);
        System.out.println("Employee details: " + E2);
    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\6> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\6\" ; if ($?) { javac Emp.java } ; if ($?) { java Emp }
// Employee details: 111 Rakesh 50000 bsc cs
// Employee details: 112 Suresh 25000 msc cs
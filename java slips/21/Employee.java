// Slip21_2: Create an employee class(id,name,deptname,salary). Define a default and 
// parameterized constructor. Use ‘this’ keyword to initialize instance variables. Keep a 
// count of objects created. Create objects using parameterized constructor and display the 
// object count after each object is created. (Use static member and method). Also display 
// the contents of each object. 

class Employee {
    int id;
    String name, deptname;
    double sal;
    static int cnt = 0;

    Employee() {
        cnt++;
        displayCount();
    }

    Employee(int id, String name, String deptname, double sal) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.sal = sal;
        cnt++;
        displayCount();
    }

    public static void displayCount() {
        System.out.println("Total Objects created " + cnt);
    }

    public void displayData() {
        System.out.println(this.id + "\t\t" + this.name + "\t\t\t" + this.deptname + "\t\t" + this.sal);

    }

    public static void main(String args[]) {
        Employee e1 = new Employee(101, "Maithili", "HR", 120020.20);

        Employee e2 = new Employee(102, "Soham", "IT", 140020.20);
        Employee e3 = new Employee(104, "Akshay", "Accounts", 100020.20);
        System.out.println("EID\t\tName\t\t\tDepartment\t\tSalary");
        e1.displayData();
        e2.displayData();
        e3.displayData();
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\20> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\21\" ; if ($?) { javac Employee.java } ; if ($?) { java Employee }
// Total Objects created 1
// Total Objects created 2
// Total Objects created 3
// EID             Name                    Department              Salary
// 101             Maithili                        HR              120020.2
// 102             Soham                   IT              140020.2
// 104             Akshay                  Accounts                100020.2
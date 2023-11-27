// Slip26_1: Define a Item class (item_number, item_name, item_price). Define a default 
// and parameterized constructor. Keep a count of objects created. Create objects using 
// parameterized constructor and display the object count after each object is created.(Use 
// static member and method). Also display the contents of each object

class Item {
    int ino;
    String iname;
    double iprice;
    static int count = 0;

    Item() {
    }

    Item(int no, String nm, double d) {
        ino = no;
        nm = iname;
        iprice = d;
        count++;
    }

    public void display() {
        System.out.println("Total objects created " + count);
        System.out.println(ino + " " + iname + " " + iprice);
    }

    public static void main(String args[]) {
        Item ob1 = new Item(1, "Laptop", 20000.00);
        ob1.display();
        Item ob2 = new Item(1, "Laptop", 20000.00);
        ob2.display();
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\26> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\26\" ; if ($?) { javac Item.java } ; if ($?) { java Item }    
// Total objects created 1
// 1 null 20000.0
// Total objects created 2
// 1 null 20000.0
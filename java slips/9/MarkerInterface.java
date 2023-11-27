// Slip9_2: Write a program to using marker interface create a class Product (product_id, 
// product_name, product_cost, product_quantity) default and parameterized constructor. Create 
// objectsof class product and display the contents of each object and Also display the object 
// count. 

import java.util.*;

interface MarkerInt {
}

class product implements MarkerInt {
    int pid, pcost, quantity;
    String pname;
    static int cnt;

    // Default constructor
    product() {
        pid = 1;
        pcost = 10;
        quantity = 1;
        pname = "pencil";
        cnt++;
    }

    // Parameterized constructor
    product(int id, String n, int c, int q) {
        pid = id;
        pname = n;
        pcost = c;
        quantity = q;
        cnt++;
        System.out.println("\nCOUNT OF OBJECT IS : " + cnt + "\n");
    }

    public void display() {
        System.out.println("\t" + pid + "\t" + pname + "\t" + pcost + "\t" + quantity);
    }
}

class MarkerInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Product : ");
        int n = sc.nextInt();
        product pr[] = new product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter " + (i + 1) + " Product Details :\n");
            System.out.println("Enter Product ID: ");
            int pid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Product Name: ");
            String pn = sc.nextLine();
            System.out.println("Enter Product Cost:");
            int pc = sc.nextInt();
            System.out.println("Enter Product Quantity:");
            int pq = sc.nextInt();
            pr[i] = new product(pid, pn, pc, pq);
        }
        System.out.println("\n\t\t Product Details\n");
        System.out.println("\tId\tPname\tCost\tQuantity\n");
        for (int i = 0; i < n; i++) {
            pr[i].display();
        }
        sc.close();
    }
}


// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\9\" ; if ($?) { javac MarkerInterface.java } ; if ($?) { java MarkerInterface }
// Enter Number of Product : 
// 3

// Enter 1 Product Details :

// Enter Product ID: 
// 101
// Enter Product Name: 
// Glass
// Enter Product Cost:
// 200
// Enter Product Quantity:
// 2

// COUNT OF OBJECT IS : 1   


// Enter 2 Product Details :

// Enter Product ID:        
// 102
// Enter Product Name: 
// Fruits
// Enter Product Cost:
// 500
// Enter Product Quantity:
// 3

// COUNT OF OBJECT IS : 2


// Enter 3 Product Details :

// Enter Product ID:
// 103
// Enter Product Name:
// Vegetables
// Enter Product Cost:
// 50
// Enter Product Quantity:
// 4

// COUNT OF OBJECT IS : 3


//                  Product Details

//         Id      Pname   Cost    Quantity

//         101     Glass   200     2
//         102     Fruits  500     3
//         103     Vegetables      50      4
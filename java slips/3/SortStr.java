// Slip3_1: Write a program to accept ‘n’ name of cities from the user and sort them in 
// ascending order.

import java.util.Scanner;

class SortStr {
    public static void main(String args[]) {
        String temp;
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = SC.nextInt();
        SC.nextLine(); // ignore next line character

        String names[] = new String[N];

        System.out.println("Enter names: ");
        for (int i = 0; i < N; i++) {
            System.out.print("Enter name [ " + (i + 1) + " ]: ");
            names[i] = SC.nextLine();
        }

        // sorting strings

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) {
                    temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("\nSorted names are in Ascending Order: ");
        for (int i = 0; i < N; i++) {
            System.out.println(names[i]);
        }
    }
}


// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\2> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\3\" ; if ($?) { javac SortStr.java } ; if ($?) { java SortStr }
// Enter the value of N: 5
// Enter names: 
// Enter name [ 1 ]: Pune
// Enter name [ 2 ]: Mumbai
// Enter name [ 3 ]: Satara
// Enter name [ 4 ]: Solapur
// Enter name [ 5 ]: Kolhapur

// Sorted names are in Ascending Order:
// Kolhapur
// Mumbai
// Pune
// Satara
// Solapur
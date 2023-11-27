// Slip4_1: Write a program to print an array after changing the rows and columns of a given two dimensional array.

import java.util.*;

class ArrTrans {
    public static void main(String args[]) {
        System.out.println("enter the row and column");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        System.out.println("enter the array list:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for (int i = 0; i < c; i++) {

            for (int j = 0; j < r; j++) {
                System.out.print(" " + mat[j][i]);
            }
            System.out.println(" ");
        }
    }
}


// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\4> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\4\" ; if ($?) { javac ArrTrans.java } ; if ($?) { java ArrTrans }      
// enter the row and column
// 2
// 3
// enter the array list:
// 1 6 2 9 10 5
// the matrix is:
//  1 9 
//  6 10
//  2 5
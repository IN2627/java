// Slip19_1: Write a program to accept the two dimensional array from user and display 
// sum of its diagonal elements

import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        int m, n, i, j, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        m = sc.nextInt();

        int array[][] = new int[m][m];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < m; j++)
                array[i][j] = sc.nextInt();

        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
                if (i == j)
                    sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of Diagonal elements is " + sum);

    }
}

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\18> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\19\" ; if ($?) { javac Array.java } ; if ($?) { java Array }  
// Enter order of matrix: 2
// Enter the elements of the array: 
// 1 2 3 4
// Elements of the array are: 
// 1 2 
// 3 4
// Sum of Diagonal elements is 5
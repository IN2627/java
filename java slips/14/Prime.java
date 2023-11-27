// Slip14_1: Write a program to accept a number from the user, if number is zero then throw user 
// defined exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).

import java.util.Scanner;
import java.util.*;

class Zerono extends Exception {
}

class Prime {
    static int count = 0;

    public static void main(String args[]) {
        int no, i, j;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter no");
            no = sc.nextInt();
            if (no == 0)
                throw new Zerono();
            if (no > 0) {
                for (i = 2; i <= no / 2; i++) {
                    if (no % i == 0) {
                        count++;
                    }
                }
            }
            if (count == 0)
                System.out.println("No is Prime");
            else
                System.out.println("Not a Prime number");
        } catch (Zerono ob) {
            System.out.println("no can not be zero");
        }
    }
}
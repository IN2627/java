// Slip23_1: Define a class MyNumber having one private int data member. Write a default 
// constructor to initialize it to 0 and another constructor to initialize it to a value (Use 
// this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in 
// main.Use command line arguments to pass a value to the Object

import java.util.*;

class slip23_1 {
    private int data;

    slip23_1() {
        data = 0;
    }

    slip23_1(int data) {
        this();
        this.data = data;
    }

    public void isPositive(int x) {
        if (x > 0) {
            System.out.println(x + " Number is Positive ");
        }
    }

    public void isNegetive(int x) {
        if (x < 0) {
            System.out.println(x + " Number is Negetive");
        }
    }

    public void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " Number is Even");
        }
    }

    public void isOdd(int x) {
        if (x % 2 != 0) {
            System.out.println(x + " Number is Odd ");
        }
    }

    public void isZero(int x) {
        if (x == 0) {
            System.out.println(x + " Number is Zero ");
        }
    }

    public static void main(String args[]) {
        int data = Integer.parseInt(args[0]);
        slip23_1 ob = new slip23_1(data);
        ob.isPositive(data);
        ob.isNegetive(data);
        ob.isEven(data);
        ob.isOdd(data);
        ob.isZero(data);
    }
}
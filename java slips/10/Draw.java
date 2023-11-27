// Slip10_1: Write a program to find the cube of given number using functional interface

import java.util.*;

interface Cube {
    float cube();
}

class Draw implements Cube {
    public float cube() {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        float cu = sc.nextInt();
        double cue = cu * cu * cu;
        System.out.println("cube of no is:" + cue);
        return 0;
    }

    public static void main(String args[]) {
        Draw d = new Draw();
        d.cube();
    }
}

// OUTPUT

// ------------------
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\10> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\10\" ; if ($?) { javac Draw.java } ; if ($?) 
// { java Draw }
// enter the number
// 2
// cube of no is:8.0
// Slip16_1: Write a program to find the Square of given number using function interface

interface Square {
    int calculate(int x);
}

class Slip16_1 {
    public static void main(String args[]) {
        // you can read value from user
        int a = 5;
        Square s = (int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\16\" ; if ($?) { javac Slip16_1.java } ; if ($?) { java Slip16_1 
// }
// 25
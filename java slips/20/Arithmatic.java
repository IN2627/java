import operation.Maximum;
import java.util.*;

class Arithmatic {
    public static void main(String args[]) {

        int n1, n2;
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no=");
        n1 = sc.nextInt();
        System.out.println("Enter second no=");
        n2 = sc.nextInt();
        System.out.println("Enter third no=");
        num1 = sc.nextFloat();
        System.out.println("Enter fourth no=");
        num2 = sc.nextFloat();

        Maximum ob1 = new Maximum(n1, n2, num1, num2);

        ob1.add();
        ob1.sub();
        ob1.max();

    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\20\operation> javac Maximum.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\20\operation> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\20\" ; if ($?) { javac Arithmatic.java } ; if ($?) { java Arithmatic }
// Enter first no=
// 1 
// Enter second no=
// 2
// Enter third no=
// 3
// Enter fourth no=
// 4
// addition is=3
// subtraction is=-1.0
// 2 is greater than 1
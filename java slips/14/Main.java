
// Mainfile 
import SY.SYMarks;
import TY.TYMarks;
import java.io.*;

class SYTY {
    int rollno;
    int ComputerTotal, MathsTotal, ElecTotal, Theory, Practicals;
    String name;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public SYTY() {
    }

    public SYTY(int rollno, String name) throws Exception {
        this.rollno = rollno;
        this.name = name;

        System.out.println("Enter SY marks: ");

        System.out.println("\nEnter computer marks");
        ComputerTotal = Integer.parseInt(br.readLine());

        while ((ComputerTotal < 0 || ComputerTotal > 100)) {
            System.out.println("\n\tInvalid marks.....");

            System.out.println("Please ReEnter the marks: ");
            ComputerTotal = Integer.parseInt(br.readLine());
        }

        System.out.println("\nEnter maths marks");
        MathsTotal = Integer.parseInt(br.readLine());

        while ((MathsTotal < 0 || MathsTotal > 100)) {
            System.out.println("\n\tInvalid marks.....");

            System.out.println("Please Reenter the marks: ");
            MathsTotal = Integer.parseInt(br.readLine());
        }
        System.out.println("\nEnter electronics marks");
        ElecTotal = Integer.parseInt(br.readLine());

        while ((ElecTotal < 0 || ElecTotal > 100)) {
            System.out.println("\n\tInvalid marks.....");

            System.out.println("Please Reenter the marks: ");
            ElecTotal = Integer.parseInt(br.readLine());
        }
        SYMarks sy = new SYMarks(ComputerTotal, MathsTotal, ElecTotal);
        System.out.print("\nEnter TY marks: ");

        System.out.print("\nEnter theory marks ");
        Theory = Integer.parseInt(br.readLine());

        while ((Theory < 0 || Theory > 100)) {
            System.out.println("\n\tInvalid marks.....");
            System.out.println("Please Reenter the marks: ");
            Theory = Integer.parseInt(br.readLine());
        }
        System.out.print("\nEnter practicals marks ");
        Practicals = Integer.parseInt(br.readLine());

        while ((Practicals < 0 || Practicals > 100)) {
            System.out.println("\n\tInvalid marks.....");

            System.out.println("Please Reenter the marks: ");
            Practicals = Integer.parseInt(br.readLine());
        }
        TYMarks ty = new TYMarks(Theory, Practicals);

        CalculateGrade();
    }

    public void getdata() throws Exception {
        System.out.println("\nEnter number of students: ");
        int n = Integer.parseInt(br.readLine());

        SYTY object[] = new SYTY[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter name: ");
            String name = br.readLine();

            System.out.println("\nEnter roll no: ");
            int roll = Integer.parseInt(br.readLine());

            object[i] = new SYTY(roll, name);
            System.out.println("----------------------");
        }
    }

    public void CalculateGrade() {
        double percentage;

        percentage = (ComputerTotal + MathsTotal + ElecTotal + Theory +
                Practicals) / 5;
        System.out.println("Result:");

        if (percentage >= 70)
            System.out.println("Grade:A");

        else if (percentage >= 60)
            System.out.println("Grade:B");

        else if (percentage >= 50)
            System.out.println("Grade:C");

        else if (percentage >= 40)
            System.out.println("Grade:PASS");
        else
            System.out.println("Grade:FAIL\n\tTry Again..........");
    }

    public static void main(String args[]) throws Exception {
        SYTY st = new SYTY();
        st.getdata();
    }
}


// OUTPUT
// 
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\14\TY> javac SYMarks.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\14\TY> javac TYMarks.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\14> javac Main.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\14> java SYTY      

// Enter number of students:
// 2

// Enter name:
// Altaf

// Enter roll no:
// 101
// Enter SY marks: 

// Enter computer marks
// 98

// Enter maths marks
// 99

// Enter electronics marks
// 89

// Enter TY marks:
// Enter theory marks 90

// Enter practicals marks 80
// Result:
// Grade:A
// ----------------------

// Enter name:
// Rahul

// Enter roll no:
// 102
// Enter SY marks: 

// Enter computer marks
// 89

// Enter maths marks
// 90

// Enter electronics marks
// 79

// Enter TY marks:
// Enter theory marks 89

// Enter practicals marks 60
// Result:
// Grade:A
// ----------------------
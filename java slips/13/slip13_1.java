// Slip13_1: Write a program to accept a file name from command prompt, if the file exits 
// then display number of words and lines in that file. 

import java.io.*;

class slip13_1 {
    public static void main(String argd[]) throws Exception {
        String fname = argd[0];
        File f = new File(fname);
        if (f.isFile()) {
            FileInputStream fis = new FileInputStream(fname);
            int ch, cnt = 0;
            while ((ch = fis.read()) != -1) {
                if (ch == '\n') {
                    cnt++;
                }
            }
            System.out.println("Number of line in Given file is " + cnt);
        } else {
            System.out.println("file not exists");
        }
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\13> javac slip13_1.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\13> java slip13_1 fis  
// Number of line in Given file is 3
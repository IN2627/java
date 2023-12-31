// Slip 13_2: Write a program to display the system date and time in various 
// formats shown below: Current date is : 31/08/2021 
// Current date is : 08-31-2021 
// Current date is : Tuesday August 31 2021 
// Current date and time is : Fri August 31 
// 15:25:59 IST 2021 Current date and time is : 
// 31/08/21 15:25:59 PM +0530

import java.text.SimpleDateFormat;
import java.util.Date;

class slip13_2 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);

        SimpleDateFormat formatter1 = new SimpleDateFormat("MM-dd-yyyy");
        String strDate1 = formatter1.format(date);
        System.out.println(strDate1);

        SimpleDateFormat formatter2 = new SimpleDateFormat("EEEEE MMMMM dd yyyy");
        String strDate2 = formatter2.format(date);
        System.out.println(strDate2);

        SimpleDateFormat formatter3 = new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy");
        String strDate3 = formatter3.format(date);
        System.out.println(strDate3);

        SimpleDateFormat formatter4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        String strDate4 = formatter4.format(date);
        System.out.println(strDate4);
    }
}

// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\13> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\13\" ; if ($?) { javac slip13_2.java } ; if ($?) { java slip13_2 }
// 23/11/2023
// 11-23-2023
// Thursday November 23 2023
// Thursday November 23 21:35:49 IST 2023
// 23/11/2023 21:35:49 pm
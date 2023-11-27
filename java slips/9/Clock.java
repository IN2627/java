// Slip9_1: Define a “Clock” class that does the following ; 
// a. Accept Hours, Minutes and Seconds 
// b. Check the validity of numbers 
// c. Set the time to AM/PM mode 
// Use the necessary constructors and methods to do the above task 

import java.util.*;

class Clock {
    int hours, minutes, seconds;

    Clock() {
        System.out.println("enter the time in HH MM SS format");
        Scanner sc = new Scanner(System.in);
        this.hours = sc.nextInt();
        this.minutes = sc.nextInt();
        this.seconds = sc.nextInt();
    }

    void isTimeValid() {
        if (hours >= 0 && hours < 24 && minutes > 0 && minutes < 60
                && seconds > 0 && seconds < 60)
            System.out.println("time is valid");
        else
            System.out.println("time is not valid");
    }

    void setTimeMode() {
        if (hours < 12) {
            System.out.println("time ="
                    + hours + ":" + minutes + ":" + seconds + " AM");
        } else
            hours = hours - 12;
        System.out.println("time ="
                + hours + ":" + minutes + ":" + seconds + " PM");
    }

    public static void main(String args[]) {

        Clock c = new Clock();
        c.isTimeValid();
        c.setTimeMode();
    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\8> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\9\" ; if ($?) { javac Clock.java } ; if ($?) { java Clock }
// enter the time in HH MM SS format
// 12 59 34
// time is valid
// time =0:59:34 PM

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\9> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\9\" ; if ($?) { javac Clock.java } ; if ($?) { java Clock }
// enter the time in HH MM SS format
// 25 23 43
// time is not valid
// time =13:23:43 PM
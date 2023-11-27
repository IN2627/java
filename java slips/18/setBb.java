// Slip18_2 Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, 
//  MOBILE: 9730381255 | WWW.NRCLASSESPUNE.COM | WWW.BCSBCA.COM
// bat_avg). 
// Create an array of n player objects. Calculate the batting average for each player 
// using static method avg(). Define a static sort method which sorts the array on the 
// basis of average. 
// Display the player details in sorted order. 

import java.util.Scanner;

class cricket {
    int inning, tofnotout, totalruns;
    String name;
    float batavg;
    int i;

    cricket() {
        name = null;
        inning = 0;
        tofnotout = 0;
        totalruns = 0;
        batavg = 0;
    }

    void get() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("name, no of innings, no of time(s) not out, total runs");
        name = s1.nextLine();
        inning = s1.nextInt();
        tofnotout = s1.nextInt();
        totalruns = s1.nextInt();
    }

    void put() {
        System.out.println("name: " + name);
        System.out.println("no of innings: " + inning);
        System.out.println("no of time(s) not out: " + tofnotout);
        System.out.println("total runs: " + totalruns);
        System.out.println("batting average: " + batavg);
    }

    static void avg(int n, cricket c[]) {
        for (int i = 0; i < n; i++) {
            c[i].batavg = c[i].totalruns / c[i].inning;
        }
    }

    static void sort(int n, cricket c[]) {
        String temp1;
        int temp2, temp3, temp4;
        float temp5;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i].batavg < c[j].batavg) {
                    temp1 = c[i].name;
                    c[i].name = c[j].name;
                    c[j].name = temp1;
                    temp2 = c[i].inning;
                    c[i].inning = c[j].inning;
                    c[j].inning = temp2;
                    temp3 = c[i].tofnotout;
                    c[i].tofnotout = c[j].tofnotout;
                    c[j].tofnotout = temp3;
                    temp4 = c[i].totalruns;
                    c[i].totalruns = c[j].totalruns;
                    c[j].totalruns = temp4;
                    temp5 = c[i].batavg;
                    c[i].batavg = c[j].batavg;
                    c[j].batavg = temp5;
                }
            }
        }
    }
}

class setBb {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        int n = s1.nextInt();
        cricket c[] = new cricket[n];
        for (int i = 0; i < n; i++) {
            c[i] = new cricket();
            c[i].get();
        }
        cricket.avg(n, c);
        cricket.sort(n, c);
        for (int i = 0; i < n; i++) {
            c[i].put();
        }
    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\18\" ; if ($?) { javac setBb.java } ; if ($?) { java setBb }
// Enter The Limit: 
// 2
// name, no of innings, no of time(s) not out, total runs
// rohit
// 15
// 5
// 543
// name, no of innings, no of time(s) not out, total runs
// Virat 
// 20
// 5
// 765
// name: Virat
// no of innings: 20       
// no of time(s) not out: 5
// total runs: 765
// batting average: 38.0
// name: rohit
// no of innings: 15
// no of time(s) not out: 5
// total runs: 543
// batting average: 36.0
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\18> 
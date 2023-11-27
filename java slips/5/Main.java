// Slip5_1: Write a program for multilevel inheritance such that Country is inherited from 
// Continent.State is inherited from Country. Display the place, State, Country and Continent

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Continent {
    String con;
    InputStreamReader i = new InputStreamReader(System.in);
    BufferedReader r = new BufferedReader(i);

    void con_input() throws IOException {
        System.out.println("Enter the continent name:");
        con = r.readLine();
    }
}

class Country extends Continent {
    String cou;

    void cou_input() throws IOException {
        System.out.println("Enter the country name:");
        cou = r.readLine();
    }
}

class State extends Country {
    String sta;

    void sta_input() throws IOException {
        System.out.println("Enter the state name:");
        sta = r.readLine();
    }
}

class Main extends State {
    String pla;

    void pla_input() throws IOException {
        System.out.println("Enter the place name:");
        pla = r.readLine();
    }

    public static void main(String args[]) throws IOException {
        Main s = new Main();
        s.con_input();
        s.cou_input();
        s.sta_input();
        s.pla_input();
        System.out.println("place is:" + s.pla);
        System.out.println("state is:" + s.sta);
        System.out.println("country is:" + s.cou);
        System.out.println("continent is:" + s.con);
    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\5\" ; if ($?) { javac Main.java } ; if ($?) { java Main }
// Enter the continent name:
// Asia
// Enter the country name:
// India
// Enter the state name:
// Maharashtra
// Enter the place name:
// Pimpri Chinchwad
// place is:Pimpri Chinchwad
// state is:Maharashtra
// country is:India
// continent is:Asia
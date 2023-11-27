// Slip 3_2: Define a class patient (patient_name, patient_age, 
// patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle 
// appropriate exception while patient oxygen level less than 95% and HRCT scan 
// report greater than 10, then throw user defined Exception “Patient is Covid Positive(+) 
// and Need to Hospitalized” otherwise display its information.

import java.io.*;

class CovidException extends Exception {
    public CovidException() {
        System.out.println("Patient is Covid Positive and needs to be hospitalized");
    }
}

class Patient {
    String name;
    int age;
    double level, hrct;

    public Patient(String name, int age, double level, double hrct) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.hrct = hrct;
    }

    public static void main(String[] args) throws IOException {
        String name;
        int age;
        double level, hrct;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        name = br.readLine();
        System.out.println("Enter the age: ");
        age = Integer.parseInt(br.readLine());
        System.out.println("Oxygen level: ");
        level = Double.parseDouble(br.readLine());
        System.out.println("HRCT report: ");
        hrct = Double.parseDouble(br.readLine());
        Patient ob = new Patient(name, age, level, hrct);
        try {
            if (ob.level < 95 && ob.hrct > 10)
                throw new CovidException();
            else
                System.out.println("Patient Info: \n" + "Name: " + ob.name + "\nAge: " + ob.age + "\nHRCT report: "
                        + ob.hrct + "\nOxygen level:" + ob.level);
        } catch (CovidException e) {
        }
    }
}


// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\3> javac CovidException.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\3> java Patient             
// Pankaj
// Enter the age:
// 29
// Oxygen level:
// 90
// HRCT report:
// 15
// Patient is Covid Positive and needs to be hospitalized

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\3> java Patient
// Enter name: 
// Altaf
// Enter the age: 
// 21
// Oxygen level:
// 96
// HRCT report:
// 5
// Patient Info:
// Name: Altaf
// Age: 21
// HRCT report: 5.0
// Oxygen level:96.0
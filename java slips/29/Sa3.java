// Slip29_2: Write a program to create a super class Vehicle having members Company and 
// price. 
// Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle 
// (capacity_in_tons). Accept the information for "n" vehicles and display the 
// information in appropriate form. While taking data, ask user about the type of vehicle 
// first. 

import java.io.*;

class Vehicle {
    String company;
    double price;

    public void accept() throws IOException {
        System.out.println("Enter the Company and price of the Vehicle: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        company = br.readLine();
        price = Double.parseDouble(br.readLine());

    }

    public void display() {
        System.out.println("Company: " + company + " Price: " + price);
    }

}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public void accept() throws IOException {
        super.accept();
        System.out.println("Enter the mileage of the vehicle: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mileage = Double.parseDouble(br.readLine());
    }

    public void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double captons;

    public void accept() throws IOException {
        super.accept();
        System.out.println("Enter the capacity of vehicle in tons: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        captons = Double.parseDouble(br.readLine());
    }

    public void display() {
        super.display();
        System.out.println("Capacity in tons: " + captons);
    }
}

class Sa3 {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Enter the type of vehicle: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Light Vehicle");
        System.out.println("2.Heavy Vehicle");
        int ch = Integer.parseInt(br.readLine());
        switch (ch) {
            case 1:
                System.out.println("Enter the number of Light vehicles: ");
                int n = Integer.parseInt(br.readLine());
                LightMotorVehicle[] l = new LightMotorVehicle[n];
                for (i = 0; i < n; i++) {
                    l[i] = new LightMotorVehicle();
                    l[i].accept();
                }
                for (i = 0; i < n; i++) {
                    l[i].display();
                }
                break;
            case 2:
                System.out.println("Enter the number of Heavy vehicles: ");
                int m = Integer.parseInt(br.readLine());
                HeavyMotorVehicle[] h = new HeavyMotorVehicle[m];
                for (i = 0; i < m; i++) {
                    h[i] = new HeavyMotorVehicle();
                    h[i].accept();
                }
                for (i = 0; i < m; i++) {
                    h[i].display();
                }
                break;
        }
    }
}


// OUTPUT

// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\29\" ; if ($?) { javac Sa3.java } ; if ($?) { java Sa3 }
// Enter the type of vehicle: 
// 1.Light Vehicle
// 2.Heavy Vehicle
// 1
// Enter the number of Light vehicles: 
// 1
// Enter the Company and price of the Vehicle: 
// Hero
// 98000
// Enter the mileage of the vehicle: 
// 75
// Company: Hero Price: 98000.0
// Mileage: 75.0
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\29> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\29\" ; if ($?) { javac Sa3.java } ; if ($?) { java Sa3 }      
// Enter the type of vehicle: 
// 1.Light Vehicle
// 2.Heavy Vehicle
// 2
// Enter the number of Heavy vehicles: 
// 1    
// Enter the Company and price of the Vehicle: 
// TATA
// 700000
// Enter the capacity of vehicle in tons: 
// 1000000
// Company: TATA Price: 700000.0
// Capacity in tons: 1000000.0
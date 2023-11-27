// Slip11_1: Define an interface “Operation” which has method volume( ).Define a constant PI 
// having a value 3.142 Create a class cylinder which implements this interface (members – 
// radius,height). Create one object and calculate the volume.

import java.io.*;

interface Operation {
    final static float pi = 3.142f;

    void area();

    void volume();
}

class Cylinder implements Operation {
    double radius, height;

    void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter the radius and height=");
        radius = Double.parseDouble(br.readLine());
        height = Double.parseDouble(br.readLine());
    }

    public void area() {
        double a = (2 * pi * radius * height) + (2 * pi * radius * radius);
        System.out.println("the area of cylinder is " + a);
    }

    public void volume() {
        double v = pi * radius * radius * height;
        System.out.println("the volume of cylinder is " + v);
    }
}

class slipno11a {
    public static void main(String args[]) throws Exception {
        Cylinder C1 = new Cylinder();
        C1.input();
        C1.area();
        C1.volume();
    }
}


// OUTPUT
// S C:\Users\altaf\OneDrive\Desktop\java\java slips\11> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\11\" ; if ($?) { javac slipno11a.java } ; if 
// ($?) { java slipno11a }

//  Enter the radius and height=3 
// 2
// the area of cylinder is 94.25999879837036
// the volume of cylinder is 56.55599927902222
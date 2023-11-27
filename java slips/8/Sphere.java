// Slip8_1: Create a class Sphere, to calculate the volume and surface area of sphere. (Hint : Surface 
// area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))

import java.util.*;

class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        double surface_area = (4 * 3.14 * (radius * radius));
        double volume = ((double) 4 / 3) * 3.14 * (radius * radius * radius);
        System.out.println("The surface area of the sphere = " + surface_area);
        System.out.println("The volume of sphere = " + volume);
    }
}

// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips> cd "c:\Users\altaf\OneDrive\Desktop\java\java slips\8\" ; if ($?) { javac Sphere.java } ; if ($?) { java Sphere }
// Enter the radius of the sphere: 
// 4 
// The surface area of the sphere = 200.96  
// The volume of sphere = 267.94666666666666

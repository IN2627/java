// Slip2_1: Write a program to read the First Name and Last Name of a person, his weight and 
// height using command line arguments. Calculate the BMI Index which is defined as the 
// individual's body mass divided by the square of their height. 
// (Hint : BMI = Wts. In kgs / (ht)2

// body mass index 
class BM {
    public static void main(String args[]) {
        String fname = args[0];
        String lname = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double BMI = weight / (height * height);
        System.out.println("First name is:" + fname);
        System.out.println("Last Name is:" + lname);
        System.out.println("weight is:" + weight);
        System.out.println("height is:" + height);
        System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}

// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\2> javac BM.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\2> java BM Altaf Mulla 50 165
// First name is:Altaf
// Last Name is:Mulla
// weight is:50.0
// height is:165.0
// The Body Mass Index (BMI) is 0.0018365472910927456 kg/m2
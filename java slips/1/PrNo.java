// Slip 1_1: Write a Program to print all Prime numbers in an array of ‘n’ elements. (use command line arguments) 

class PrNo {
    public static void main(String[] args) {
        int size = args.length;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(array[i] + " are the prime numbers in the array ");
            else
                System.out.println(array[i] + " is not the prime number in the array ");
        }
    }
}

// OUTPUT
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\1> javac PrNo.java
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\1> java PrNo 23
// 23 are the prime numbers in the array
// PS C:\Users\altaf\OneDrive\Desktop\java\java slips\1> java PrNo 21
// 21 is not the prime number in the array
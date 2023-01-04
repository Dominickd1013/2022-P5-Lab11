// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

import java.util.Scanner;

public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }
    // Treat all numbers as prime, make a loop that does this and changes all values to true in computeprimes
    // Step 2 remove primes
    // To start remove multiples of 2

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        System.out.print("Values before the change.");

        for (int k = 2; k < primes.length; k++) {


        }
    }

    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();

        for (int k = 2; k < primes.length; k++) {
            System.out.print(k + " ");

        }
    }

}




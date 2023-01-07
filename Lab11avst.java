// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
import java.util.Scanner;

public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean isprime[];
        isprime = new boolean[MAX];
        computeisprime(isprime);
        displayisprime(isprime);
    }

    public static void computeisprime(boolean isprime[]) {

        System.out.println("\nCOMPUTING PRIME NUMBERS");
        System.out.println("Values before the change.");
        System.out.print("\n");

        for (int p = 2; p < isprime.length; p++) {
            isprime[p] = true;
        }

        System.out.print(isprime);
        for (int i = 2; i < isprime.length; i++) {
            for (int k = 2 * i; k < isprime.length; k += i) {
                isprime[k] = false;
            }
        }

    }

    public static void displayisprime(boolean isprime[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + isprime.length);
        System.out.println();

        for (int k = 2; k < isprime.length; k++) {
            if (isprime[k] == true) ;
            System.out.print(k + " ");
        }

    }
}


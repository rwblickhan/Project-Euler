//Problem 3 - Largest Prime Factor

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		//Sets the given for the problem
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long num = Long.parseLong(scanner.next());
		System.out.println("You entered " + num);
		largestPrimeFactor(num);
	}

	public static void largestPrimeFactor(long num) {
		//Checks every int from 1 to the given (i > given cannot be factor of given)
		for (long i = 1; i < num; i++) {
			if (num % i == 0) {
			//Checks if the current int is a factor of the given
				if (isPrime(i)) {
				//Checks if the current int is a prime
					System.out.println(i);
				}
			}
		}
	}

	public static boolean isPrime(long i) {
		//Checks if the given integer is prime by checking its number of divisors
		long numDivisors = 0;
		for (long d = 1; d <= i; d++) {
			if (i % d == 0) {
				numDivisors++;
			}
			if (numDivisors >= 3) {return false;}
		}	
		return true;
	}
}

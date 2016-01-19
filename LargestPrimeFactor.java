//Problem 3 - Largest Prime Factor

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		long num = Long.parseLong(scanner.next());
		System.out.println("You entered " + num);
		largestPrimeFactor(num);
	}

	public static void largestPrimeFactor(long num) {
		for (long i = 1; i < num; i++) {
			if (num % i == 0) { 
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}

	public static boolean isPrime(long i) {
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

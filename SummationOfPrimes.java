//Problem 10 - Summation of Primes

import java.util.Scanner;
import java.util.Vector;

public class SummationOfPrimes {
	public static Vector<Long> primes;
	public static void main(String[] args) {
		primes = new Vector<Long>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bound: ");
		long bound = Integer.parseInt(scanner.next());
		long sum = 0;
		for (long i = 2; i <= bound; i++) {
			if (isPrime(i)) {
				primes.add(i);
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isPrime(long i) {
		long count = 0;
		for (long prime : primes) {
			if (i % prime == 0) {
				return false;
			}
		}
		primes.add(i);
		System.out.println(i);
		return true;
	}
}

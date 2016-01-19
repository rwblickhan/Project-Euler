//Problem 5 - Smallest Multiple

import java.util.Scanner;

public class SmallestMultiple {
	public static void main(String[] args) {
		//Sets the given for the problem
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bound: ");
		int bound = Integer.parseInt(scanner.next());
		boolean finished = false;
		//count starts at bound + 1 because it must be evenly divisible by all ints from 1 to bound, so count > bound 
		int count = bound + 1;
		while (!finished) {
			//Continually increments count until isEvenlyDivisible is true
			if (isEvenlyDivisible(count, bound)) {
				System.out.println(count);
				finished = true;
			}
			count++;
		}	
	}
	
	public static boolean isEvenlyDivisible(int num, int bound) {
		//Checks if num is evenly divisible by every integer from 1 to bound
		for (int i=1; i<=bound; i++) {
			if (!(num%i==0)) {
				return false;
			}
		}
		return true;
	}
	
}

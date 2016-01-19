//Problem 5 - Smallest Multiple

import java.util.Scanner;

public class SmallestMultiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bound: ");
		int bound = Integer.parseInt(scanner.next());
		boolean finished = false;
		int count = bound + 1;
		while (!finished) {
			if (isEvenlyDivisible(count, bound)) {
				System.out.println(count);
				finished = true;
			}
			count++;
		}	
	}
	
	public static boolean isEvenlyDivisible(int num, int bound) {
		for (int i=1; i<=bound; i++) {
			if (!(num%i==0)) {
				return false;
			}
		}
		return true;
	}
	
}

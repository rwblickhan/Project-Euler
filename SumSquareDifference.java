//Problem 6 - Sum Square Difference

import java.util.Scanner;

public class SumSquareDifference {
	public static void main(String[] args) {
		//Sets given for the problem
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bound: ");
		int bound = Integer.parseInt(scanner.next());
		System.out.println(Math.abs(sumOfSquares(bound) - squareOfSums(bound)));
	}
	
	public static int sumOfSquares(int bound) {
		int sum = 0;
		for (int i = 1; i <= bound; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
		return sum;
	}
	public static int squareOfSums(int bound) {
		int sum = 0;
		for (int i = 1; i <= bound; i++) {
			sum = sum + i;
		}
		System.out.println(sum*sum);
		return sum * sum;
	}
}

//Problem 39 - Integer Right Triangles

public class IntRightTriangles {
	public static void main(String[] args) {
		//most is the largest number of solutions that has been found so far
		int most = 0;
		//best is the value for p corresponding to most
		int best = -1;
		//Checks every value of p from 1 to 1000
		for (int p = 1; p <= 1000; p++) {
			System.out.println("Checking p = " + p + "...");
			int numSolns = findNumSolutions(p);
			if (numSolns > most) {
				most = numSolns;
				best = p;
			}
		}
		System.out.println("The best value of p is " + best + " with " + most + " solutions.");
	}
	public static int findNumSolutions(int p) {
		int numSolutions = 0;
		//Checks every combination of a, b, c up to p
		for (int a = 0; a < p; a++) {
			for (int b = 0; b < p; b++) {
				for (int c = 0; c < p; c++) {
					if ((a + b + c == p) && (a * a + b * b == c * c)) {
						numSolutions++;
					}
				}
			}
		}
		return numSolutions;
	}
}

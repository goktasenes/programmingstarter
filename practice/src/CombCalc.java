import java.util.Scanner;
public class CombCalc {

	public static void main(String[] args) {
	
		// Write a program in Java to calculate combinations.
		// Combination formula: C(n,r) = n! / (r! * (n-r)!)

		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("We're calculating C(n,r)");
		System.out.println("Enter n:");
		int n = inp.nextInt();
		System.out.println("Enter r:");
		int r = inp.nextInt();
				
		int comb = factorial(n) / (factorial(r) * factorial(n-r));
		System.out.println("Combination C(" + n + "," + r + ") = " + comb);
	}

	public static int factorial(int a) {
		
		int f=1;

		for (int i=1; i<=a; i++) {
			
			
			f *= i;
			
		}
		
		return f;
	}
			
}

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		
		// "Create a Java program that calculates exponentiation using a 'for loop'."
		Scanner inp = new Scanner(System.in);
		
		System.out.println("base:");
		int base = inp.nextInt();
		
		System.out.println("exponent:");
		int exponent = inp.nextInt();
		
		int result = 1;
		
		for (int i=0; i<exponent; i++) {
			
			result *= base;
			
		}
		
		System.out.println("result: " + result);
	}

}

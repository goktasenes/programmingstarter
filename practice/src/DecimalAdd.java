import java.util.Scanner;

public class DecimalAdd {

	public static void main(String[] args) {
		
		// Write a program that calculates the sum of the digits of a number.

		Scanner inp = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = inp.nextInt();
		
		int sum=0;
		
		while (num > 0) {
			int digit = num % 10;
	        sum += digit;
	        num /= 10;
	        }

		System.out.println("sum: " +sum);

	}

}

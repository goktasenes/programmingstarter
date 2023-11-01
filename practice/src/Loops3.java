import java.util.Scanner;
public class Loops3 {

	public static void main(String[] args) {
		// We are writing a program in Java using loops 
		// to print the powers of 4 and 5 up to the entered number on the screen.

		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number:");
		num = input.nextInt();
		
		for (int i=0; i<=num; i++) {
			
			System.out.println(4 + "^" + i + " = " + (int) Math.pow(4, i));
			System.out.println(5 + "^" + i + " = " + (int) Math.pow(5, i));
		}
	}

}

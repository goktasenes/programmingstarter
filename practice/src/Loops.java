import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
	
		// We are writing a program in Java using loops to calculate the average of numbers 
		// from 0 to a user-entered number that are divisible by 3 and 4.

		
		
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("number:");
		int num = input.nextInt();
		
		for (int i=0; i<=num; i++) {
			
			if (i%3==0 || i%4==0) {
				
				sum += i;
				
			}
		}
		
		System.out.println("sum: " + sum);
		

	}

}

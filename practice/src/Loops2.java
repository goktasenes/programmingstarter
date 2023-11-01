import java.util.Scanner;
public class Loops2 {

	public static void main(String[] args) {
	
		// We are writing a program in Java that accepts user inputs until a single number is entered using loops. 
		// It then adds up the even numbers and multiples of 4 among the entered values and displays the result on the screen.

		
		Scanner input = new Scanner(System.in);
		
		int sum=0, num, numdiv2;
		
		
		do {
			
			System.out.println("enter an odd number: ");
			num = input.nextInt();
			numdiv2 = num/2;
			
			if (num % 2 == 0 || numdiv2 % 2 == 0) {
				
				sum += num;
				
			}

		}
		while(num % 2 == 0);
		
		System.out.println("sum: " + sum);
	}

}

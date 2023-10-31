import java.util.Scanner;
public class OrderNumbers {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("first number: ");
		num1 = inp.nextInt();
		
		System.out.println("second number: ");
		num2 = inp.nextInt();
		
		System.out.println("third number: ");
		num3 = inp.nextInt();
		
		if (num1>num2) {
			
			if (num1>num3) {
				
				System.out.println("the greatest is " + num1);
				
				if (num3>num2) {
					
					System.out.println("the smallest is " + num2);

				}
				
				else {
					System.out.println("the smallest is " + num3);

				}
				
			}
			
			else {
				
				System.out.println("the greatest is " + num3);
				System.out.println("the smallest is " + num2);

			}
			

		}
		
		else {
			
			if (num2>num3) {
				
				System.out.println("the greatest is " + num2);
				
				if(num3>num1) {
					
					System.out.println("the smallest is " + num1);

				}
				else {
					System.out.println("the smallest is " + num3);

				}
			
			}
			
			else {
				
				System.out.println("the greatest is " + num3);
				System.out.println("the smallest is " + num1);
			}
		}
	}

}

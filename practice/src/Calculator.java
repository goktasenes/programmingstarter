import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		int n1, n2, select, result;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		n1 = input.nextInt();
		System.out.println("Enter the second number: ");
		n2 = input.nextInt();
		
		System.out.println("1-Add\n2-Subtract\n3-Multiply\n4-Divide");
		System.out.println("Select the operator: ");
		select = input.nextInt();
		
		switch (select) {
			
			case 1:
				result = n1+n2;
				System.out.println("Result: " + result);
				break;
			case 2:
				result = n1-n2;
				System.out.println("Result: " + result);
				break;
			case 3:
				result = n1*n2;
				System.out.println("Result: " + result);
				break;
			case 4:
				result = n1/n2;
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Your selected an invalid number!!");
		
		
		
		
		
		}

	}

}

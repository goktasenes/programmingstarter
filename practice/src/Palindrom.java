
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		// Palindrom number check (eg 9889, 343)
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("number:");
		String num = inp.next();
		
		boolean isPal=true;
		
		for (int i=0; i<num.length()/2; i++) {
			
			if (num.charAt(i) != num.charAt(num.length() -i - 1)) {
					 
				isPal = false;
				break;
				}
			
		}
		
		System.out.println(isPal);
		
		
		
	}

}

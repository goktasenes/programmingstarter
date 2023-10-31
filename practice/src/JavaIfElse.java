import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		int n;
		
		do {
            System.out.print("");
            n = inp.nextInt();

            if (n < 1 || n > 100) {
                System.out.println("Invalid number! " + n);
            }
        } while (n < 1 || n > 100);

        inp.close();
        
		if (n%2==0) {
			
			if(n>1 && n<6) {
				
				System.out.println("Not Weird");
			}
			
			else if(n>5 && n<21) {
				
				System.out.println("Weird");
			}
			
			else {
				
				System.out.println("Not Weird");
			}
		}
		
		else {
			
			System.out.println("Weird");
		}
		
	}

}

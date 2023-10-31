import java.util.Scanner;

public class ActivityHeat {

	public static void main(String[] args) {
				
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		int heat = inp.nextInt();
		
		if (heat<5) {
			System.out.println("Try skiing");
		}
		
		else if (heat >= 5 && heat <= 15) {
			System.out.println("Try cinema");
			
		}
		
		else if (heat > 15 && heat <= 25) {
			System.out.println("Have a picnic");
			
		}
		
		else{
			System.out.println("Try swimming");
		}
	
		
		
		
		
		
		
		
		
	}

}

import java.util.Scanner;
public class GreengrocerCashier {

	public static void main(String[] args) {
		
		double pear=2.14, apple=3.67, tomato=1.11, banana=0.95, eggplant=5, checkout;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("How many kg of pear?: ");
		pear = inp.nextDouble();
		
		System.out.println("How many kg of apple?: ");
		apple = inp.nextDouble();
		
		System.out.println("How many kg of tomato?: ");
		tomato = inp.nextDouble();
		
		System.out.println("How many kg of banana?: ");
		banana = inp.nextDouble();
		
		System.out.println("How many kg of eggplant?: ");
		eggplant = inp.nextDouble();
		
		checkout = pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + eggplant*5; 
		System.out.println(checkout);
	}

}

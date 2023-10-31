import java.util.Scanner;
public class Taximeter {

	public static void main(String[] args) {
		
		double minf=20, openf=10, kmf=2.20, totalkm, totalf=10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the total km traveled: ");
		totalkm = input.nextDouble();
		
		if (totalkm > 4.54) {
			totalf += kmf*totalkm;
		}
		else {
			totalf=minf;
		}
		
		System.out.println("fare on taximeter: " + totalf);
		
	}

}

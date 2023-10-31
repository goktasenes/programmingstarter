import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		
		double mass, height, index;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter your mass: ");
		mass = inp.nextDouble();
		System.out.println("Enter your height in meter: ");
		height = inp.nextDouble();
		
		index = mass / (height*height);
		
		System.out.println("body mass index of yours is: " + index);
		
	}

}

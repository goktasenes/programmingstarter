import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		
		int angle, radius; 
		
		double pi=3.14, area;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		radius = inp.nextInt();
		System.out.println("Enter central angle: ");
		angle = inp.nextInt();
		
		area =  (pi * (radius*radius) * angle) / 360;
		System.out.println("AREA:" + area);

	}

}

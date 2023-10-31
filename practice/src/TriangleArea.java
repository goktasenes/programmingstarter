import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
	
		
	double side1, side2, side3, area, s;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first side of the triangle: ");
	side1 = input.nextDouble();
	System.out.println("Enter the second side of the triangle: ");
	side2 = input.nextDouble();
	System.out.println("Enter the third side of the triangle: ");
	side3 = input.nextDouble();
	
	s = (side1+side2+side3)/2;
	area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	System.out.print("Area of the triangle: " + area);
	
	}

}

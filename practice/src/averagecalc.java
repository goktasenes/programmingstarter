
import java.util.Scanner;

public class averagecalc {

	public static void main(String[] args) {
		
		int math, phys, hist, lang;

		Scanner inp = new Scanner(System.in);
		
		System.out.println("Math mark: ");
		math = inp.nextInt();

		System.out.println("Phys mark: ");
		phys = inp.nextInt();
		
		System.out.println("Hist mark: ");
		hist = inp.nextInt();
		
		System.out.println("Lang mark: ");
		lang = inp.nextInt();
		
		int average = (math+phys+hist+lang)/4;
		System.out.println("Your average is: " + average);
		
		if (average < 60) {
			System.out.println("FAILED!!");
		}
		else {
			System.out.println("CONGRATS you passed!!");
		}
	}

}


import java.util.*;
public class GradePass {

	public static void main(String[] args) {
		
		
		int total=0, counter=0;
		double average;
		
		String[] courses = {"math", "phys", "chem", "ling", "music"};
		
		Scanner input = new Scanner(System.in);
			
		for (int i=0; i < courses.length; i++) {
		
			System.out.println(courses[i] + " mark: ");
			int mark = input.nextInt();
			
			if (0 <= mark && mark <= 100) {
				
				total+=mark;
				counter += 1;
			}
		}
		
		average = total/counter;
		
		System.out.println("Average: "+ average);
		System.out.println(total + "\n" + counter);
		
		if (average >=55) {
			
			System.out.println("Congrats!!");
		}
		
		else {
			System.out.println("Failed :(");
		}
		
		
			
	}

}

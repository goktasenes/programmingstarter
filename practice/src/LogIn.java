import java.util.Scanner;
public class LogIn {

	public static void main(String[] args) {
		
		String username, password, selection, newpassword;
		
		Scanner input = new Scanner(System.in);
		System.out.println("username: ");
		username = input.next();
		System.out.println("password: ");
		password = input.next();

		if (username.equals("enes") && password.equals("java")) {
			System.out.println("logged in successfully");
		}
		
		else {
			System.out.println("wrong username or password");
			
			System.out.println("forgot password?\n1-yes\t2-no");
			selection = input.next();
			
			switch (selection) {
				
				case "1":
					
					System.out.println("Enter new password: ");
					newpassword = input.next();
					
					while (newpassword.equals("java")) {
						
						System.out.println("Password couldn't be changed, enter another one: ");
						newpassword = input.next();
						
					}
					System.out.println("New password created! \nyour username: enes\nyour new password: " + newpassword);
					break;
					
				default:
					System.out.println("You seem to be don't remember but also don't wanna change it. OK.");
			
			}
			
		}
		
		

	}

}

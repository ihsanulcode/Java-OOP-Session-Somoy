import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		input.nextLine();
		System.out.println("You have entered: "+n);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Your name is: "+name);
		
		System.out.println("Enter your cgpa: ");
		double cgpa = input.nextDouble();
		System.out.println("Your cgpa is: "+cgpa);
		
		//boolean b = input.nextBoolean();

	}

}

import java.util.Scanner;

public class EvenOdee {

	public static void main(String[] args) {
		// Find whether a number is even or odd. Get the number from user input
		
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//getting a number from user
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		//checking
		if(n==0) {
			System.out.println("Zero");
		}else if(n%2==0) {
			System.out.println("Even!");
		}else if(n%2 != 0) {
			System.out.println("Odd!");
		}

		input.close();
	}

}

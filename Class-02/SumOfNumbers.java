import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		/*
		 * Write a program that takes a number N as user input then calculate sum of 1
		 * to N.
		 */

		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting user input
		System.out.println("Enter N: ");
		int n = input.nextInt();

		// loop
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i; // sum = sum+i;
		}

		// output
		System.out.println("Sum: " + sum);

		input.close();

	}

}

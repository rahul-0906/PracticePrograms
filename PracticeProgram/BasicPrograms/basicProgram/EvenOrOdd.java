package basicProgram;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Using if..else
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Number " + number + " is Even");
		}else {
			System.out.println("Number " + number + " is Odd");
		}

		//using Ternary operator
		
		String result = number % 2 == 0 ? "Even" : "Odd";
		
		System.out.println("\nNumber " + number + " is " + result);
	}

}

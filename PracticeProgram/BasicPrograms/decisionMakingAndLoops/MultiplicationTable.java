package decisionMakingAndLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Table: ");
		int table = s.nextInt();
		System.out.println("Enter the Start and End Value: ");
		int start = s.nextInt();
		int end = s.nextInt();
		
		for(int i=start;i<=end;i++) {
			System.out.println(i + " * " + table + " = " + table*i);
		}
		
		//Using While Loop
		System.out.println("\n\n\n");
		int i=start;
		while(i<=end) {
			System.out.println(i + " * " + table + " = " + table*i);
			i++;
		}
	}

}

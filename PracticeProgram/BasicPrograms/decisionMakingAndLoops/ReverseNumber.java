package decisionMakingAndLoops;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 4567;
		int rev = 0;
		
		System.out.println("Original Number: " + num);
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed Number: " + rev);
	}

}

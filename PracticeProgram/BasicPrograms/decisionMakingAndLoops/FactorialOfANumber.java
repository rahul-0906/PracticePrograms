package decisionMakingAndLoops;

import java.math.BigInteger;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int fac = 1;
		int num = 30;
		
		for(int i=1;i<=num;i++) {
			
			fac *= i;
		}
		System.out.println("Factorial is = " + fac);
	
		// Using While Loop
		
		fac = 1;
		
		int i = 1;
		
		while(i<=num) {
			
			fac *= i;
			
			i++;
		}
		System.out.println("\nFactorial is = " + fac);
		
		// Using Biginteger
		
		BigInteger fact = BigInteger.ONE;
		
		for(int j=1;j<=num;j++) {
			
			fact = fact.multiply(BigInteger.valueOf(j));
		}
		System.out.println("\nFactorial Value with BigInteger is = " + fact);
	}

}

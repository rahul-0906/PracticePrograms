package decisionMakingAndLoops;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int num = 5;
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			
			sum += i;
		}
		
		System.out.println("Sum = " + sum);
		
		sum = 0;
		int i=0;
		while(i<= num) {
			sum += i;
			
			i++;
		}
		System.out.println("\nSum = " + sum);
	}

}

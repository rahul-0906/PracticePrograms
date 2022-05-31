package decisionMakingAndLoops;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		int number = 983452;
		int count = 0;
		
		while(number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count: " + count);
		
		number = 9098928;
		count = 0;
		for(;number != 0;number /= 10,count ++) {
			
		}
		
		System.out.println("\nCount: " + count);
	}

}

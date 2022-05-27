package decisionMakingAndLoops;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n = 10;
		int first = 0;
		int second = 1;
		
		System.out.println("Fibonacci Series till " + n + " terms: ");
//		for(int i=1;i<=n;i++) {
//			System.out.print(first + ", ");
//			
//			int next = first + second;
//			first = second;
//			second = next;
//		}

		System.out.println("\n\nFibnoacci Series upto " + n + ": ");
		first = 0;
		second = 1;
		while(first <=n) {
			System.out.print(first + ", ");
			
			int next = first + second;
			first = second;
			second = next;
		}
	}

}

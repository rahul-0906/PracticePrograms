package basicProgram;

public class FibonacciSeries {

	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
 		return fib(n - 1) + fib(n - 2);
		
	}
	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		int num = 10;
		int c = 0;
		System.out.print(a + " " + b);
		for(int i=2;i<num;i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
		
		System.out.println(fib(9));
	}

}

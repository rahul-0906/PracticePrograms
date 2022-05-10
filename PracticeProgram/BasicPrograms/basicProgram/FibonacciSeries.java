package basicProgram;

public class FibonacciSeries {

	
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
	}

}

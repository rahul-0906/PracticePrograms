package basicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 5;
		for(int i=2;i<=a/2;i++) {
			if(a % i != 0) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
		}

	}

}

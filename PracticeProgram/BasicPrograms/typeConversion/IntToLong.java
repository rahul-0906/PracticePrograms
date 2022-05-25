package typeConversion;

public class IntToLong {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 30;
		
		long num1 = a;
		long num2 = b;
		
		System.out.println("Value is: " + num1);
		System.out.println("Value is: " + num2);
		
		Long c = Long.valueOf(num1);
		Long d = Long.valueOf(num2);
		
		System.out.println("\nValue is: " + c);
		System.out.println("Value is: " + d);
	}

}

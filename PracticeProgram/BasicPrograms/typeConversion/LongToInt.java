package typeConversion;

public class LongToInt {

	public static void main(String[] args) {

		long num1 = 2345673L;
		long num2 = 3769896L;
		
		int a = (int)num1;
		int b = (int)num2;
		
		System.out.println("Value is: " + a);
		System.out.println("Value is: " + b);
		
		num1 = 23181718L;
		num2 = -98768656L;
		
		a = Math.toIntExact(num1);
		b = Math.toIntExact(num2);
		
		System.out.println("\nValue is: " + a);
		System.out.println("value is: " + b);
		
		Long num = 987876L;
		
		a = num.intValue();
		
		System.out.println("\nValue is: " + a);

	}

}

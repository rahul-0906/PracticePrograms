package typeConversion;

public class ConvertCharToInt {

	public static void main(String[] args) {

		// Method 1
		
		char a = '5';
		char b = 'c';
		
		int num1 = a;
		int num2 = b;
		
		System.out.println("Number1 is " + num1);
		System.out.println("Number2 is " + num2);
		
		// Method 2
		a = '5';
		b = '6';
		
		num1 = Character.getNumericValue(a);
		num2 = Character.getNumericValue(b);
		
		System.out.println("\nNumber1 is " + num1);
		System.out.println("Number2 is " + num2);
		
		//Method 3
		
		num1 = Integer.parseInt(String.valueOf(a));
		num2 = Integer.parseInt(String.valueOf(b));
		
		System.out.println("\nNumber1 is " + num1);
		System.out.println("Number2 is " + num2);
		
		//Method 4
		
		num1 = a -'0';
		num2 = b -'0';
		
		System.out.println("\nNumber1 is " + num1);
		System.out.println("Number2 is " + num2);
	}

}

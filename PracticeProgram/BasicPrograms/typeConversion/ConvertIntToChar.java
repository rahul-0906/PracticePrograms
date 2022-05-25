package typeConversion;

public class ConvertIntToChar {

	public static void main(String[] args) {
		
		int num1 = 80;
		int num2 = 81;
		
		char a = (char) num1;
		char b = (char) num2;
		
		System.out.println("Character is: " + a);
		System.out.println("Character is: " + b);
		
		num1 = 1;
		num2 = 13;
		a = Character.forDigit(num1, 10);
		b = Character.forDigit(num2, 16);
		
		System.out.println("\nCharacter is: " + a);
		System.out.println("Character is: " + b);
		
		num1 = 1;
		num2 = 9;
		a = (char)(num1 + '0');
		b = (char)(num2 + '0');
		
		System.out.println("\nCharacter is: " + a);
		System.out.println("Character is: " + b);
	}

}

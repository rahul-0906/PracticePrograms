package typeConversion;

import java.util.Arrays;

public class ConvertCharacterToString {

	public static void main(String[] args) {
		
		// Method 1:
		
		char ch = 'c';
		
		String str = Character.toString(ch);
		
		System.out.println("The String is: " + str);
		
		// Method 2 Convert Character Array to String
		
		char[] cha = {'a','e','i','o','u'};
		
		String str1 = String.valueOf(cha);
		String str2 = new String(cha);
		
		System.out.println("\nString is: " + str1);
		System.out.println("String is: " + str2);
		
		//Method 3 Convert Character to String
		
		String s = "This is Great Place";
		
		cha = s.toCharArray();
		
		System.out.println();
		System.out.println(Arrays.toString(cha));

	}

}

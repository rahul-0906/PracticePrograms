package basicProgram;

public class AlphabetIsVowelOrConsonant {

	public static void main(String[] args) {
		
		char ch = 'a';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a Vowel");
		}else {
			System.out.println(ch + " is a Consonant");
		}
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("\n"+ ch + " is a Vowel");
			break;
		default:
			System.out.println("\n" + ch + " is a Consonant");
		}
		
	}
}

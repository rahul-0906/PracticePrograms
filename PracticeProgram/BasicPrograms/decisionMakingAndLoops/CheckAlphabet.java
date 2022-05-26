package decisionMakingAndLoops;

public class CheckAlphabet {

	public static void main(String[] args) {
		
		char ch = '1';
		
		if(ch >= 'a' && ch <=  'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a Aplhabet");
		}else {
			System.out.println(ch + " is Not a Aplhabet");
		}
		
		// Using Ternary Operator
		
		String result = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ? ch + " is a Aplhabet" : ch + " is not a Alphabet";
		
		System.out.println("\n" + result);
		
		// Using isAlphabetic
		
		if(Character.isAlphabetic(ch)) {
			System.out.println("\n" + ch + " is a Alphabet");
		}else {
			System.out.println("\n" + ch + " is not a Alphabet");
		}
	}

}

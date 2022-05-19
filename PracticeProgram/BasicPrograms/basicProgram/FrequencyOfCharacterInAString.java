package basicProgram;

public class FrequencyOfCharacterInAString {

	public static void main(String[] args) {

		String word = "Rahul Babua";
		char ch = 'a';
		int frequency = 0;
		for(int i=0;i<word.length();i++) {
			if(ch == word.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("Frequency is " + frequency);

	}

}

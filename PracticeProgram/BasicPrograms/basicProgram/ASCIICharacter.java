package basicProgram;

public class ASCIICharacter {

	public static void main(String[] args) {
		
		char ch = 'A';
		int ascii = ch;
		int castAscii = (int)ch;
		
		System.out.println("The value of: " + ch + " is: " + ascii);
		System.out.println("The value of: " + ch + " is: " + castAscii);
	}

}

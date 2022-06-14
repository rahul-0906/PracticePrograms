package round2.practice.zoho;

/*
 * Write a program to give the following output for the given input
Eg 1: Input: a1b10
Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/

public class String1 {

	public static void main(String[] args) {

		String s = "a1b2c3";
		String num = "";
		char letter = ' ';

		for (char c : s.toCharArray()) {

			if ((c >= '0' && c <= '9')) {
				num += c;
			} else {

				if (num != "") {
					int n = Integer.parseInt(num);
					for (int i = 0; i < n; i++) {
						System.out.print(letter);
					}
				}

				letter = c;
				num = "";
			}
		}
		int n = Integer.parseInt(num);
		for (int i = 0; i < n; i++) {
			System.out.print(letter);
		}
	}

}

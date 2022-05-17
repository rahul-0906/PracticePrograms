package basicProgram;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// Normal if..else
		int n1 = 20;
		int n2 = 40;
		int n3 = 90;
		
		if(n1 >= n2 && n1 >=  n3) {
			System.out.println("Number " + n1 + " is Greater");
		}else if(n2 >= n1 && n2 >= n3) {
			System.out.println("Number " + n2 + " is Greater");
		}else {
			System.out.println("Number " + n3 + " is Greater");
		}

		// nested if..else
		
		if(n1 >= n2) {
			if(n1 >= n3) {
				System.out.println("Number " + n1 + " is Greater");
			}else {
				System.out.println("Number " + n3 + " is Greater");
			}
		}else {
			if(n2 >= n3) {
				System.out.println("Number " + n2 + " is Greater");
			}else {
				System.out.println("Number " + n3 + " is Greater");
			}
		}
	}

}

package decisionMakingAndLoops;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 1900;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year + " Year is Leap Year");
				}else {
					System.out.println(year + " Year is Not a Leap Year");
				}
			}else {
				System.out.println(year + " Year is Leap Year");
			}
		}else {
			System.out.println(year + " Year is Not a Leap Year");
		}

	}

}

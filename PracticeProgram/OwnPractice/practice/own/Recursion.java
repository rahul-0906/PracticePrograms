package practice.own;

public class Recursion {

	public static void main(String[] args) {
			
		function(1);

	}
	public static void function(int sum) {
		if(sum == 5) {
			return;
		}
		function(sum + 1);
		function(sum + 1);
		System.out.println(sum);
	}

}

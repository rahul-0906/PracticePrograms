package basicProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// With Temporary Variable
		int firstNumber = 20;
		int secondNumber = 50;
		
		int temp = 0;
		
		System.out.println("FirstNumber Before Swap: " + firstNumber);
		System.out.println("SecondNumber Before Swap: " + secondNumber);
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("FirstNumber After Swap: " + firstNumber);
		System.out.println("SecondNumber After Swap: " + secondNumber);
		
		// Without Temporary Variable
		
		firstNumber = 20;
		secondNumber = 50;
		
		System.out.println("\nFirstNumber Before Swap: " + firstNumber);
		System.out.println("SecondNumber Before Swap: " + secondNumber);
		
		firstNumber = firstNumber + secondNumber; // 70 = 20 + 50
		secondNumber = firstNumber - secondNumber; // 20 = 70 - 50
		firstNumber = firstNumber - secondNumber ;//  50   = 70 - 20
		System.out.println("FirstNumber After Swap: " + firstNumber);
		System.out.println("SecondNumber After Swap: " + secondNumber);
		
	}

}

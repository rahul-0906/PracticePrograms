package round2.practice.zoho;

import java.util.Scanner;

/*
 * Write a program to sort the elements in odd positions in  ascending order and elements in
descending order
Eg 1: Input: 13,2 4,15,12,10,5
Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
Output: 9,2,7,4,5,6,3,8,1
*/
public class Array1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int n = s.nextInt();
		int[] arr = new int[100];
		int[] oddArr = new int[100];
		int[] evenArr = new int[100];
		int evenIndex = 0;
		int oddIndex = 0;
		
		for( i=1;i<=n;i++) {
			arr[i] = s.nextInt();
		}
		
		for( i=1;i<=n;i++) {
			if(i % 2 == 0) {
				evenArr[evenIndex++] = arr[i];
			}else {
				oddArr[oddIndex++] = arr[i];
			}
		}
		
		for( i=0;i<oddIndex;i++) {
			for( j=i+1;j<oddIndex;j++) {
				
				if(oddArr[i] > oddArr[j]) {
					int temp = oddArr[i];
					oddArr[i] = oddArr[j];
					oddArr[j] = temp;
				}
			}
		}
		for( i=0;i<evenIndex;i++) {
			for( j=i+1;j<evenIndex;j++) {
				
				if(evenArr[i] < evenArr[j]) {
					int temp = evenArr[i];
					evenArr[i] = evenArr[j];
					evenArr[j] = temp;
				}
			}
		}
		
		for( i=0,j=0;i<oddIndex && j<evenIndex;i++,j++) {
			System.out.print(oddArr[i] + " " + evenArr[j] + " ");
		}
		while(i < oddIndex) {
			System.out.print(oddArr[i]);
			i++;
		}
		while(j < evenIndex) {
			System.out.print(evenArr[i]);
			j++;
		}
	}

}

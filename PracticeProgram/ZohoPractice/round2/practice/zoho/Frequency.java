package round2.practice.zoho;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[50];
		int i = 0,j=0;
		
		for(i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int[] frequency = new int[n];
		int visited = -1;
		
		for(i=0;i<n;i++) {
			int count = 1;
			for(j=i+1;j<n;j++) {
				
				
				if(arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if(frequency[i] != visited) {
				frequency[i] = count;
			}
		}
		
		for(i =0;i<n;i++) {
			if(frequency[i]!= visited) {
				System.out.print(arr[i]+"(" + frequency[i]+")");
			}
		}

	}

}

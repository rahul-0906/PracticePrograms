package practice.own;

public class BinarySearch {
	public static int findMin(int[] num) {
		if(num.length == 1) {
			return num[0];
		}
		if(num[0] < num[num.length-1]) {
			return num[0];
		}
		
		int left =0;
		int right = num.length - 1;
		
		while(right >= left) {
			int mid = left + (right - left ) / 2;
			
			if(num[mid] > num[mid + 1]) {
				return num[mid + 1];
			}
			if(num[mid - 1 ] > num[mid]) {
				return num[mid];
			}
			
			if(num[mid] > num[0]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] A = { 4,5,6,7,2,3 };
		
		int index = findMin(A);
		 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }

	}

}

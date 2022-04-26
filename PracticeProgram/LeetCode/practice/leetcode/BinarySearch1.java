package practice.leetcode;

public class BinarySearch1 {
	
	public static int search(int[] nums, int target) {
        int left = 0;
       int right = nums.length - 1;

       while(right >= left){
    	   int mid = left + (right - left) / 2;
			if(nums[mid] == target){
				return mid;
			}
           else if(nums[mid] > target){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
       return -1;
   }

	public static void main(String[] args) {
		int[] A = { -1,0,3,5,9,12 };
		int target = 9;
		
		int index = search(A,target);
		 
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }

	}

}

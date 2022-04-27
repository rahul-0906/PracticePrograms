package practice.leetcode;

/*There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104*/

public class SearchRotatedSortedArray {

	 public static int search(int[] nums, int target) {
	        if(nums.length == 0 || nums == null){
	            return -1;
	        }
	        
	            
	        int left = 0;
	        int right = nums.length - 1;
	        while(left < right){
	            int mid = left + (right - left) / 2;

	            if(nums[mid] > nums[right]){
	                left = mid + 1;
	            }else{
	                right = mid;
	            }
	        }
	        
	        int start = left;
	        left = 0;
	        right = nums.length - 1;
	        if(target >= nums[start] && target <= nums[right]){
	            left = start;
	        }else{
	            right = start;
	        }
	        
	        while(left <= right){
	            int mid = left + (right - left) / 2;
	            
	            if(nums[mid] == target){
	                return mid;
	            }else if(nums[mid] > target){
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
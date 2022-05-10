package practiceProgram;

/*Given an array of integers nums which is sorted in ascending order, and an integer target, 
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 

Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.*/

public class BinarySearch1 {

	public static int search(int[] nums,int target) {
		int left = 0;
		int right = nums.length - 1;
		
		while(right >= left) {
			
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] > target) {
				right = mid -1;
			}else {
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

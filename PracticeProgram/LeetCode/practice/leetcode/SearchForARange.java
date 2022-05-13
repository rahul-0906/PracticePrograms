package practice.leetcode;

public class SearchForARange {

	public static int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
        	//return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        int result[] = null;
        int mid = left + (right - left) / 2;
        
        if(nums[mid] == target) {
        	result[0] = mid;
        }
		
    }
	
	public static void main(String[] args) {
		

	}

}

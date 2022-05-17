package practice.leetcode;

public class SearchForARange {

	public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        result[0] = -1;
        result[1] = -1;
        if(nums == null || nums.length == 0) {
        	return result;
        }
		
        int left = 0;
        int right = nums.length - 1;
        // to find the first occurence 
        while (left + 1 < right) {
        	int mid = left + (right - left) / 2;
        	
        	if(nums[mid] == target) {
        		right = mid;
        	}else if(nums[mid] > target) {
        		right = mid;
        	}else {
        		left = mid;
        	}
        }
        
        if(nums[right] == target) {
        	result[0] = right;
        }
        if(nums[left] == target) {
        	result[0] = left;
        }
        
        left = 0;
        right = nums.length - 1;
        
        while(left + 1 < right) {
        	
        	int mid = left + (right - left) / 2;
        	
        	if(nums[mid] == target) {
        		left = mid;
        	}else if(nums[mid] < target){
        		left = mid;
        	}else {
        		right = mid;
        	}
        }
        
        if(nums[right] == target) {
        	result[1] = right;
        }
        if(nums[left] == target) {
        	result[1] = left;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		

	}

}

package practice.leetcode;

/*Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
   Show Hint #1  
   Show Hint #2  */
public class Sqrt {

	 public static int mySqrt(int x) {
	        
	        if(x < 2){
	            return x;
	        }
	        
	        long left = 2;
	        long right = x / 2;
	        while(left <= right){    						//Condition of binary search 
	            long mid = left + (right - left) / 2;

	            long sq = mid * mid;

	            if(sq == x){ 								//To prevent the overflow mid*mid used the "long"
	                return (int)mid;
	            }else if(sq < x){							//answer lies on the right
	                left = mid + 1;
	            }else{   									//answer lies on the left
	                right = mid - 1;
	            }
	        }
	        return (int)right;								//when hi<li returning hi
	    }
	 
	public static void main(String[] args) {
		int x = 8;
		
		System.out.println(mySqrt(x));

	}

}

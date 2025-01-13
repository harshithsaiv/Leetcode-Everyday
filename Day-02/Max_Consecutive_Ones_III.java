// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


class Solution {
    public int longestOnes(int[] nums, int k) {
        int start =0;
        int end =0;
        int max_ones=0;

        while(end<nums.length){

            if(nums[end]==0){
                k--;
            }
            
            while(k<0){
                if(nums[start]==0){
                    k++;
                }
                start++;
            }

            max_ones = Math.max(max_ones,end-start+1);
            end++; 

        }
        return max_ones;
    }
}
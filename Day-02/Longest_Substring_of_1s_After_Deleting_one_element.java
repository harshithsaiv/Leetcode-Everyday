// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
// Example 1:
// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.



class Solution {
    public int longestSubarray(int[] nums) {
        int start=0;
        int end =0;
        int zeroCount =0;
        int max_ones=0;

        while(end<nums.length){

            if(nums[end]==0){
                zeroCount++;
            }

            while(zeroCount>1){

                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }

            max_ones = Math.max(max_ones,end-start);
            end++;
        }
        return max_ones;
    }
}
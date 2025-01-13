// Find Pivot Index
// Solved
// Easy
// Topics
// Companies
// Hint

// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.



class Solution {
    public int pivotIndex(int[] nums) {
       int left_sum=0;
       ArrayList<Integer> left= new ArrayList<>();
       int right_sum=0;
       ArrayList<Integer> right=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        // System.out.println("leftsum"+left_sum);
            left.add(left_sum);
            left_sum+=nums[i];
       }

       for(int j=nums.length-1;j>=0;j--){
        // System.out.println("rightsum"+right_sum);
        right.add(right_sum);
        right_sum+=nums[j];
       }

       ArrayList<Integer> reversedRight = new ArrayList<>();
        for (int i = right.size() - 1; i >= 0; i--) {
            reversedRight.add(right.get(i));
        }

        for (int i = 0; i < nums.length; i++) {
            if (left.get(i).equals(reversedRight.get(i))) {
                return i;
            }
        }

       return -1;
    }
}
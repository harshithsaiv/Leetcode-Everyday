class Solution {
    public boolean increasingTriplet(int[] nums) {
        int nums_i = Integer.MAX_VALUE;
        int num_j = Integer.MAX_VALUE;

        for(int num : nums){
            if(num<=nums_i){
                nums_i=num;
            }
            else if(num<=num_j){
                num_j=num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
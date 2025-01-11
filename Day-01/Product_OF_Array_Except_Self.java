class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int res[] = new int[length];
        
        int prefix=1;
        res[0]=prefix;
        for(int i =1;i<length;i++){
            res[i]=prefix*nums[i-1];
            prefix=prefix*nums[i-1];
        }

        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*postfix;
            postfix=postfix*nums[i];
        }
        return res;
    }
}
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length= flowerbed.length;
        int count =0;
        if(n==0){
            return true;
        }
        if(length==1 && n>0){
            if(flowerbed[0]==0){
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=0;i<length;i++){
            if(flowerbed[i]==0){
                if(i>0 && i<length-1){
                    if(flowerbed[i-1]==0 && flowerbed[i+1] == 0){
                        flowerbed[i]=1;
                        count++;
                    }
                }
                else if(i==0){
                    if(flowerbed[i+1]==0){
                        count++;
                        flowerbed[0]=1;
                    }
                }
                else if(i==length-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }
            }
        }

        if(count<n){
            return false;
        }
        else{
            return true;
        }
    }
}
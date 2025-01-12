class Solution {
    public int compress(char[] chars) {
        int insert =0;
        int count=1;
        for(int i=0;i<chars.length;i=i+count){
            char ch = chars[i];
            count=1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[j]==ch){
                    count++;
                }
                else{
                    break;
                }
            }
            chars[insert]=chars[i];
            insert++;
            if(count>=10){
                String str = Integer.toString(count);
                char[] temp = str.toCharArray();
                for(int k=0;k<temp.length;k++){
                    chars[insert]=temp[k];
                    insert++;
                }
            }
            else if(count>1 && count<10){
                chars[insert]=(char)(count+'0');
                insert++;
            }
        }
        return insert;
    }
}
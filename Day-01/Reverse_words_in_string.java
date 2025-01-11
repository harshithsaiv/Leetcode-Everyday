class Solution {
    public String reverseWords(String s) {
         String[] words = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            String k = words[i];
                System.out.println(k);
                res.append(k);
                if(i!=0){
                    res.append(" ");
            }
        }
        return res.toString();
    }
}
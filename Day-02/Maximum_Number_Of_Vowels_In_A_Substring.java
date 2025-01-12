// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

// Example 1:

// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.


class Solution {
    public int maxVowels(String s, int k) {
        char []ch = s.toCharArray();

        int left=0;
        int ans=0;
        int curr=0;

        for(int right=0;right<ch.length;right++){
            if(isVowel(ch[right])){
                curr++;
            }
            while(right-left+1>k){
                if(isVowel(ch[left])){
                    curr--;
                }
                left++;
            }
            if((right-left+1)==k){
                ans=Math.max(curr,ans);
            }
        }
        return ans;
    }

    public boolean isVowel(char ch){
         if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return true;
        }
        return false;
    }
}
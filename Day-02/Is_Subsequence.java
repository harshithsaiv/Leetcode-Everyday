// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true




class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();
        int left=0;
        int right=0;

        while(left<s_length && right<t_length){
            if(s.charAt(left)==t.charAt(right)){
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return left==s_length;
    }
}
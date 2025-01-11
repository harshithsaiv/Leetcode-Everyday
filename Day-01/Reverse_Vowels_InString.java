// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".







class Solution {
    HashSet<Character> vowels = new HashSet<>();
    public String reverseVowels(String s) {
        vowels.add('a');
        vowels.add('A');
         vowels.add('e');
        vowels.add('E');
         vowels.add('i');
        vowels.add('I');
         vowels.add('o');
        vowels.add('O');
         vowels.add('u');
        vowels.add('U');
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(isVowel(ch1) && isVowel(ch2)){
                sb.setCharAt(i, ch2);
                sb.setCharAt(j, ch1);
                i++;
                j--;
            }
            else if(!isVowel(ch1)){
                i++;
            }
            else if(!isVowel(ch2)){
                j--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char ch){
        return vowels.contains(ch);
    }
}
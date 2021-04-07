/*
Given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.
Example 1:
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:
Input: s = "MerryChristmas"
Output: false
Example 4:
Input: s = "AbCdEfGh"
Output: true
Constraints:
2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
*/

class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        else return false;
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                c1++;
            }
            if(isVowel(s.charAt(n+i))){
                c2++;
            }   
        }
        return c1==c2 ? true : false;
    }
}

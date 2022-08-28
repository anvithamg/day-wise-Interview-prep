/*409. Longest Palindrome
Easy

3406

198

Add to List

Share
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.*/

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            int x = map.getOrDefault(s.charAt(i),0);
            x+=1;
            map.put(s.charAt(i),x);
        }
        int count = 0;
        int flag = 0;
        for(Map.Entry<Character,Integer> hm : map.entrySet()){
           if(hm.getValue()>1){
               count+= hm.getValue()/2*2;
           }     
            if(count%2 == 0 && hm.getValue()%2 == 1)
                flag = 1;
        }
        if(flag == 1)
            count += 1;
        return count;
    }
}

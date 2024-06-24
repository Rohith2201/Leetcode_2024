Statement:
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

CODE:(JAVA)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Create arrays to store the index of characters in both strings
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t
        
        // Get the length of both strings
        int len = s.length();
        
        // If the lengths of the two strings are different, they can't be isomorphic
        if(len != t.length()) {
            return false;
        }
        
        // Iterate through each character of the strings
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; // If different, strings are not isomorphic
            }
            
            // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i + 1; // updating index of current character
            indexT[t.charAt(i)] = i + 1; // updating index of current character
        }
        
        // If the loop completes without returning false, strings are isomorphic
        return true;
    }
}


PYTHON:
class Solution(object):
    def isIsomorphic(self, s, t):
        map1=[]
        map2=[]

        for idx in s:
            map1.append(s.index(idx))
        for idx in t:
            map2.append(t.index(idx))

        if map1 == map2:
            return True
        return False

        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        



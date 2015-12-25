package com.quanken.leetcode.problem3;

import java.util.Arrays;

/**
 * Longest Substring Without Repeating Characters
 *
 *  Given a string, find the length of the longest substring without repeating characters.
 *  For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 *  For "bbbbb" the longest substring is "b", with the length of 1.
 *
 *
 *  https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class Solution {
    // pre-defined method from leetcode
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length == 0)  return 0;

        // character convert to ascii code, totally 256
        int[] hash  = new int[256];
        Arrays.fill(hash, -1);

        int start = 0;
        int ans = 0;
        int i;
        for(i = 0; i < length; i++){
            // if char already exist in hash table
            int pos = hash[ s.charAt(i) ];
            if( -1 != pos ){
                // mark down the length from start to current cursor
                if(ans < i - start)
                    ans = i - start;

                // update hash table for next mapping
                for(int j = start; j < pos ; j++)
                    hash[j] = -1;

                // move the start cursor to position next the the mapped char index
                if(pos + 1  > start)
                    start = pos + 1;
            }
            // if char not exist in hash table, update index to the char
            hash[ s.charAt(i) ] = i;
        }
        // if the last substring is longer, just return its length
        if(ans < i - start)
            ans = i - start;
        return ans;
    }
}

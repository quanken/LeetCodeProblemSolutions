package com.quanken.leetcode.problem3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Case to Solution 3 :  Longest Substring Without Repeating Characters
 */
public class Tester {
    String s;
    int length;

    @Before
    public void setup() {
        s = "abcabcbb";
        length = 3;
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(s);
        Assert.assertEquals(length, result);
    }

}

package com.quanken.leetcode.problem1;

/**
 * Two Sum
 *      https://oj.leetcode.com/problems/two-sum/
 *
 * Description:
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 */
public class Solution {

    /**
     * initial function that should not change
     * @param numbers Given integer array
     * @param target target number
     * @return indices of the two number
     */
    public int[] twoSum(int[] numbers, int target) {
        if(numbers[0] > target){
            // solution not exist since target is less that the min value in array
            return null;
        }
        // loop init from 1 as the index must not be zero-based
        for(int i = 1; i <= numbers.length - 1; i++){
            // get first number to be added, the max index is numbers.length -1
            for(int j = i + 1; j <= numbers.length; j++){
                // get second number to add, the min index is first number index + 1
                if((numbers[i-1] + numbers[j-1]) == target){
                    // if sum(number1, number2) is just the two number we need
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}

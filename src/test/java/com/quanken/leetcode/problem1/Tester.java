package com.quanken.leetcode.problem1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Case to Solution 1 : Two Sum
 */
public class Tester{

    int[] numbers;
    int[] target;

    Solution solution;

    @Before
    public void setup(){
        numbers = new int[]{2, 5, 7, 8, 10, 11, 15, 20};
        target = new int[]{
            2,  // the target is less that min value in array
            7,  // the target is valid
            24, // the target could not find solution
            40  // the target is not valid since two index shouldn't be equal
        };
        solution = new Solution();
    }

    @Test
    public void test(){
        for(int t:target){
            int[] results = solution.twoSum(numbers, t);
            Assert.assertTrue((results == null || results.length == 2));
        }
    }

    /**
     * To print the solution result
     * @param numbers : source input integer array
     * @param target : two sum target number
     * @param results : solution index array
     */
    private static void printResults(int[] numbers, int target, int[] results){
        System.out.println("============= target -> " + target + " ==============");
        if(results != null){
            int index1 = results[0];
            int index2 = results[1];
            System.out.println("["+ index1 + "]->" + numbers[index1-1]
                    + " + [" + index2 + "]->" + numbers[index2-1] + " = "
                    + target + "->" + (numbers[index1-1] + numbers[index2-1]));
        }else {
            System.out.println("solution not found");
        }

    }
}

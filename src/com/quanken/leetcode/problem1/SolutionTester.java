package com.quanken.leetcode.problem1;

/**
 * A Test Case to Solution 1
 * Created by quanken on 2014/12/26.
 */
public class SolutionTester {

    public static void main(String[] args){
        int[] numbers = {2, 5, 7, 8, 10, 11, 15, 20};
        int[] target = new int[]{
                2,  // the target is less that min value in array
                7,  // the target is valid
                24, // the target could not find solution
                40  // the target is not valid since two index shouldn't be equal
        };
        Solution s = new Solution();
        for(int t:target){
            int[] results = s.twoSum(numbers, t);
            printResults(numbers, t, results);
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

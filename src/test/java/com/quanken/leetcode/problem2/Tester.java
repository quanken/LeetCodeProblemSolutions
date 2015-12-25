package com.quanken.leetcode.problem2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test Case to Solution 2 : Add Two Number
 */
public class Tester {
    Integer[] i1, i2, r;

    @Before
    public void setup() {
        i1 = new Integer[]{6, 4,  3};
        i2 = new Integer[]{5, 6,  4};
        r = new Integer[]{1, 1,  8};
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(arrToLn(i1), arrToLn(i2));
        Assert.assertArrayEquals(r, lnToArr(result));
    }

    /**
     * convert array to ListNode
     * @param arr int array
     * @return the first node of the whole link list
     */
    ListNode arrToLn(Integer[] arr){
        ListNode result = new ListNode(arr[0]);
        ListNode pre = result;
        for(int i = 1; i < arr.length; i++){
            pre.next = new ListNode(arr[i]);
            pre = pre.next;
        }
        return result;
    }

    /**
     * convert a ListNode chain to an int array
     * @param l the first node of the link list
     * @return int array
     */
    Integer[] lnToArr(ListNode l){
        List<Integer>  rl = new ArrayList<Integer>();
        ListNode r = l;
        while(r != null){
            rl.add(r.val);
            r = r.next;
        }
        int size = rl.size();
        Integer[] result = new Integer[size];
        for(int i = 0; i < size; i ++ ) {
            result[i] = rl.get(i);
        }
        return result;
    }

    /**
     * print detail item of array
     * @param arr array to be print
     */
    void printArray(Integer[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

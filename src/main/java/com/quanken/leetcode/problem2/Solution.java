package com.quanken.leetcode.problem2;

/**
 *
 * Add Two Numbers
 *
 *   You are given two linked lists representing two non-negative numbers.
 *   The digits are stored in reverse order and each of their nodes contain a single digit.
 *   Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * https://leetcode.com/problems/add-two-numbers/
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode pre = result;
        ListNode pa = l1;
        ListNode pb = l2;
        int carry = 0;

        while(pa != null || pb != null){
            int  av = pa == null ? 0 : pa.val;
            int  bv = pb == null ? 0 : pb.val;
            ListNode node = new ListNode((av + bv + carry)%10);
            carry = (av + bv + carry)/10;
            pre.next = node;
            pre = pre.next;
            pa = pa == null ? null : pa.next;
            pb = pb == null ? null : pb.next;
        }

        if(carry > 0) {
            pre.next = new ListNode(1);
        }
        pre = result.next;
        return pre;
    }
}

class ListNode {
    public int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

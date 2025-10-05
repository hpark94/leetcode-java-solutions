package com.github.hpark94.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers solution;

    @BeforeEach
    void setup() {
        solution = new AddTwoNumbers();
    }

    @Test
    void testAddTwoNumbers1() {
        ListNode l1 = new ListNode(2);
        l1.next      = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next      = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next      = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (expected != null || result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result   = result.next;
        }

        assertNull(expected);
        assertNull(result);
    }

    @Test
    void testAddTwoNumbers2() {
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        ListNode expected = new ListNode(0);

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (expected != null || result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result   = result.next;
        }

        assertNull(expected);
        assertNull(result);
    }

    @Test
    void testAddTwoNumbers3() {
        ListNode l1 = new ListNode(9);
        l1.next                          = new ListNode(9);
        l1.next.next                     = new ListNode(9);
        l1.next.next.next                = new ListNode(9);
        l1.next.next.next.next           = new ListNode(9);
        l1.next.next.next.next.next      = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next           = new ListNode(9);
        l2.next.next      = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode expected = new ListNode(8);
        expected.next                               = new ListNode(9);
        expected.next.next                          = new ListNode(9);
        expected.next.next.next                     = new ListNode(9);
        expected.next.next.next.next                = new ListNode(0);
        expected.next.next.next.next.next           = new ListNode(0);
        expected.next.next.next.next.next.next      = new ListNode(0);
        expected.next.next.next.next.next.next.next = new ListNode(1);

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (expected != null || result != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result   = result.next;
        }

        assertNull(expected);
        assertNull(result);
    }
}

package com.sandipan.aich.easy;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = new ListNode();
		ListNode node = head;

		while (l1 != null || l2 != null) {

			if (l1 == null) {
				node.next = new ListNode(l2.val);
				node = node.next;
				l2 = l2.next;
			} else if (l2 == null) {
				node.next = new ListNode(l1.val);
				node = node.next;
				l1 = l1.next;
			} else if (l2.val < l1.val) {
				node.next = new ListNode(l2.val);
				node = node.next;
				l2 = l2.next;
			} else {
				node.next = new ListNode(l1.val);
				node = node.next;
				l1 = l1.next;
			}
		}
		node = head;
		head = head.next;
		node.next = null;
		node = null;
		return head;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

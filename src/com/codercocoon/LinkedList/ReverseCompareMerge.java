package com.codercocoon.LinkedList;

/**
 * This class represents some operations about linked lists, especially how to
 * reverse a linked list, compare and merge two sorted linked lists.
 * 
 * @author contact@codercocoon.com.
 *
 */
public class ReverseCompareMerge {

	public Node insertAtLast(Node head, int _data) {
		if (head == null)
			head = new Node(_data);
		else {
			Node current = head;
			while (current.next != null)
				current = current.next;
			current.next = new Node(_data);
		}
		return head;
	}

	/**
	 * This method reverses a linked list.
	 * 
	 * @param head
	 *            : the linked list which will be reversed.
	 * @return the linked list reversed.
	 */
	public Node reverse(Node head) {

		System.out.print("Input : ");
		print(head);

		Node previous = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		System.out.print("Ouput : ");
		print(previous);

		return previous;
	}

	/**
	 * This method check if two linked lists are the same :same elements in the
	 * same order.
	 * 
	 * @param headA
	 *            : the head of the 1st linked list.
	 * @param headB
	 *            : the head of the 2nd linked list.
	 * @return "1" if the linked lists are the same, "0" if not.
	 */
	int compareLists(Node headA, Node headB) {
		int result = 0;
		if (headA == headB)
			result = 1;
		else {
			Node currentA = headA;
			Node currentB = headB;
			while (currentA != null && currentB != null) {
				if (currentA.data != currentB.data) {
					break;
				} else {
					currentA = currentA.next;
					currentB = currentB.next;
				}
			}
			if (currentA == currentB)
				result = 1;
		}
		return result;
	}

	/**
	 * This methods merges two sorted linked lists.
	 * 
	 * @param headA
	 *            : the head of the 1st linked list.
	 * @param headB
	 *            : the head of the 2nd linked list.
	 * @return the two linked lists merged.
	 */
	public Node mergeLists(Node headA, Node headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;

		if (headA.data < headB.data) {
			headA.next = mergeLists(headA.next, headB);
			return headA;
		} else {
			headB.next = mergeLists(headB.next, headA);
			return headB;
		}
	}

	/**
	 * This method prints the elements of a linked list.
	 * 
	 * @param head:head
	 *            of the linked list
	 */
	void print(Node head) {
		if (head == null)
			System.out.println(head);
		else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + "->");
				current = current.next;
				System.out.print((current == null) ? "NULL" : "");
			}
			System.out.println();
		}
	}
}

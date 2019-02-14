package javaspringexamples.LinkedList;

import java.util.Scanner;

public class TestReverseCompareMerge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		Node second = null;
		int size = 0;
		ReverseCompareMerge ll = new ReverseCompareMerge();

		System.out.println("##### Reverse a linked list. #####");
		System.out.print("Enter the linked list size : ");
		size = sc.nextInt();
		System.out.println("Enter the linked list elements : ");
		while (size > 0) {
			head = ll.insertAtLast(head, sc.nextInt());
			size--;
		}
		head = ll.reverse(head);

		System.out.println("##### Compare two linked lists. #####");
		System.out.print("The first linked list : ");
		ll.print(head);
		System.out.print("Enter the second linked list size : ");
		size = sc.nextInt();
		System.out.println("Enter the second linked list elements : ");
		while (size > 0) {
			second = ll.insertAtLast(second, sc.nextInt());
			size--;
		}
		System.out.println("Result of comparing (1:OK, 0:KO) : " + ll.compareLists(head, second));

		System.out.println("##### Merge two sorted linked lists. #####");
		head = null;
		second = null;
		System.out.print("Enter the size of the sorted Linked list A : ");
		size = sc.nextInt();
		System.out.print("Enter the elements of the sorted Linked list A : ");
		while (size > 0) {
			head = ll.insertAtLast(head, sc.nextInt());
			size--;
		}
		System.out.print("Enter the size of the sorted Linked list B : ");
		size = sc.nextInt();
		System.out.print("Enter the elements of the sorted Linked list B : ");
		while (size > 0) {
			second = ll.insertAtLast(second, sc.nextInt());
			size--;
		}
		ll.print(ll.mergeLists(head, second));

	}
}

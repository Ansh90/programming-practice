package com.anshul.interview.ds.linkedlist;

public class FindMergeNodeInLinkedList {

	public Node findMergeNode(Node headA, Node headB) {
		// Complete this function
		// Do not write the main method.
		if (headA == null || headB == null)
			return null;
		int listALen = 0, listBLen = 0;
		Node listA = headA, listB = headB;
		// get the lenght of listA
		while (listA != null) {
			listALen++;
			listA = listA.next;
		}
		// get the lenght of listB
		while (listB != null) {
			listBLen++;
			listB = listB.next;
		}

		int shift = 0;
		listA = headA;
		listB = headB;
		if (listALen > listBLen) {
			shift = listALen - listBLen;
			while (shift-- != 0) {
				listA = listA.next;
			}
		} else if (listALen < listBLen) {
			shift = listBLen - listALen;
			while (shift-- != 0) {
				listB = listB.next;
			}
		}
		while (listA != listB) {
			listA = listA.next;
			listB = listB.next;
		}
		// can return either listA or listB
		return listA;
	}

	public int findMergeIndex(Node headA, Node headB) {
		// Complete this function
		// Do not write the main method.
		if (headA == null || headB == null)
			return 0;
		int listALen = 0, listBLen = 0;
		Node listA = headA, listB = headB;
		// get the lenght of listA
		while (listA != null) {
			listALen++;
			listA = listA.next;
		}
		// get the lenght of listB
		while (listB != null) {
			listBLen++;
			listB = listB.next;
		}

		int shift = 0;
		listA = headA;
		listB = headB;
		if (listALen > listBLen) {
			shift = listALen - listBLen;
			while (shift-- != 0) {
				listA = listA.next;
			}
		} else if (listALen < listBLen) {
			shift = listBLen - listALen;
			while (shift-- != 0) {
				listB = listB.next;
			}
		}
		while (listA != listB) {
			listA = listA.next;
			listB = listB.next;
		}
		// can return either listA or listB
		return (int) listA.data;
	}

	public static void main(String[] args) {
		FindMergeNodeInLinkedList obj = new FindMergeNodeInLinkedList();

		Node list1 = obj.createLinkedList1();
		Node list2 = obj.createLinkedList2(list1);

		System.out.println(obj.findMergeIndex(list1, list2));
		System.out.println(obj.findMergeNode(list1, list2).data);
	}

	private Node createLinkedList1() {
		Node list1 = new Node<Integer>(1);
		list1.next = new Node<Integer>(8);
		list1.next.next = new Node<Integer>(11);
		list1.next.next.next = new Node<Integer>(13);
		list1.next.next.next.next = new Node<Integer>(14);
		list1.next.next.next.next.next = new Node<Integer>(19);
		list1.next.next.next.next.next.next = new Node<Integer>(26);
		list1.next.next.next.next.next.next.next = new Node<Integer>(27);
		list1.next.next.next.next.next.next.next.next = new Node<Integer>(28);
		return list1;
	}

	private Node createLinkedList2(Node list1) {
		Node list2 = new Node<Integer>(10);
		list2.next = new Node<Integer>(12);
		list2.next.next = new Node<Integer>(21);
		list2.next.next.next = new Node<Integer>(23);
		list2.next.next.next.next = new Node<Integer>(24);
		list2.next.next.next.next.next = list1.next.next.next;
		return list2;
	}
}

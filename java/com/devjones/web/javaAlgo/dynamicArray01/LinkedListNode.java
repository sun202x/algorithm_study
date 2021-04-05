package com.devjones.web.javaAlgo.dynamicArray01;

public class LinkedListNode {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.retrieve();
		ll.delete(1);
		ll.retrieve();
	}
}

class LinkedList {
	
	Node header;
	
	static class Node {
		int data;
		Node next = null;
	}
	
	LinkedList() {
		header = new Node();
	}
	
	void append(int d) {	
		Node end = new Node();
		end.data = d;
		Node n = header;

		System.out.println("end.data : " + end.data);
		System.out.println("n.data : " + n.data);
		
		System.out.println("end.next : " + end.next);
		System.out.println("n.next : " + n.next);
		
		System.out.println("end : " + end);
		System.out.println("n : " + n);
		
		System.out.println();
		
		while(n.next != null) {		// 마지막 Node를 찾자.
			n = n.next;
		}
		n.next = end;	// 마지막 Node 새로 생성ㅇ한 Node를 넣는다.
	}
	
	void delete(int d) {
		Node n = header;
		
		System.out.println();
		System.out.println("n.data : " + n.data);
		System.out.println("n.next : " + n.next);
		System.out.println("n.next.net : " + n.next.next);
		System.out.println("n : " + n);
		System.out.println();
		
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = header.next;
		
		while(n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
}
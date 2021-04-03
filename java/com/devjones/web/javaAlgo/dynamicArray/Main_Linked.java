package com.devjones.web.javaAlgo.dynamicArray;

public class Main_Linked {

	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.retrieve();
	}
}

class Node {
	int data;		// 보통은 Object 지금은 간단하게 정수값만 취급한다.
	Node next = null;	// 다음 Node. null을 초기값으로 준 이유는 마지막 Node에 null을 가지고 있어야하기 때문
	
	Node(int d) {
		this.data = d;
	}
	
	void append(int d) {	// 성공여부를 확인하기 위해 boolean 리턴타입을 도입할 수도 있다.
		Node end = new Node(d);		// 마지막에 넣을 Node
		Node n = this;				// 포인터. 첫번째 Node?

		System.out.println("end.next : " + end.next);
		System.out.println("n.next : " + n.next);
		
		while(n.next != null) {		// 마지막 Node를 찾자.
			n = n.next;
		}
		n.next = end;	// 마지막 Node 새로 생성ㅇ한 Node를 넣는다.
	}
	
	void delete(int d) {
		Node n = this;
		
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = this;
		
		while(n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
}

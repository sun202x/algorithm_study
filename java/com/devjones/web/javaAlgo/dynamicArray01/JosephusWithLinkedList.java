package com.devjones.web.javaAlgo.dynamicArray01;

import java.util.LinkedList;
import java.util.ListIterator;

public class JosephusWithLinkedList {

	public static void main(String[] args) {
		
		josephus(40, 3);
	}
	
	static void josephus(int n, int k) {
		
		LinkedList<Integer> survivors = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			survivors.add(i);
		}
		
		ListIterator<Integer> kill = survivors.listIterator(0);
		
		while(n > 2) {
			
			kill.next();
			kill.remove();
			
			if(!kill.hasNext()) kill = survivors.listIterator(0);
			
			for(int i = 0; i < k-1; i++) {
				kill.next();
				if(!kill.hasNext()) kill = survivors.listIterator(0);
			}
			
			n--;
		}
		
		System.out.println(survivors.getFirst() + ", " + survivors.getLast());
	}
}

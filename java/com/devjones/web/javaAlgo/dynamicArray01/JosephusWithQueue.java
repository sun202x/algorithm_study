package com.devjones.web.javaAlgo.dynamicArray01;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusWithQueue {

	public static void main(String[] args) {
		josephus(40, 3);
	}
	
	static void josephus(int n, int k) {
		
		Queue<Integer> survivors = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			survivors.add(i);
		}
		
		while(n > 2) {
			
			survivors.remove();
			
			for(int i = 0; i < k-1; i++) {
				survivors.add( survivors.remove() );
			}
			
			n--;
		}
		
		survivors.forEach(survivor -> System.out.println(survivor));
	}
}

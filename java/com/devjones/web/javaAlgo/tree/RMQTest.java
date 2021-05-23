package com.devjones.web.javaAlgo.tree;

public class RMQTest {
	public static void main(String[] args) {
		int[] array = {1, 2, 1, 2, 3, 1, 2, 4};
		RMQ rmq = new RMQ(array);
		
		for(int i = 0; i < rmq.rangeMin.length; i++) {
			System.out.println(i + "번째 : " + rmq.rangeMin[i]);
		}
	}
}

class RMQ {
	int n;
	int[] rangeMin;
	
	public RMQ(int[] array) {
		n = array.length;
		rangeMin = new int[n * 4];
		init(array, 0, n-1, 1);
	}
	
	public int init(int[] array, int left, int right, int node) {
		if(left == right) return rangeMin[node] = array[left];
		
		int mid = (left + right) / 2;
		int leftMin = init(array, left, mid, node * 2);
		int rightMin = init(array, mid + 1, right, node * 2 + 1);
		
		return rangeMin[node] = Math.min(leftMin, rightMin);
	}
}
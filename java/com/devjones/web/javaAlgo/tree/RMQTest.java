package com.devjones.web.javaAlgo.tree;

public class RMQTest {
	public static void main(String[] args) {
		int[] array = {1, 2, 1, 2, 3, 1, 2, 4};
		RMQ rmq = new RMQ(array);
		
		System.out.println(rmq.query(6, 8));
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
	
	private int query(int left, int right, int node, int nodeLeft, int nodeRight) {
		if(right < nodeLeft || nodeRight < left) return Integer.MAX_VALUE;
		
		if(left <= nodeLeft && nodeRight <= right) return rangeMin[node];
		
		int mid = (nodeLeft + nodeRight) / 2;
		
		return Math.min(query(left, right, node*2, nodeLeft, mid), query(left, right, node*2+1, mid+1, nodeRight));
	}
	
	public int query(int left, int right) {
		return query(left, right, 1, 0, n-1);
	}
	
	private int update(int index, int newValue, int node, int nodeLeft, int nodeRight) {
		if(index < nodeLeft || nodeRight < index) return rangeMin[node];
		
		if(nodeLeft == nodeRight) return rangeMin[node] = newValue;
		
		int mid = (nodeLeft + nodeRight) / 2;
		
		return rangeMin[node] = Math.min(
				update(index, newValue, node*2, nodeLeft, mid),
				update(index, newValue, node*2+1, mid+1, nodeRight)
				);
	}
	
	public int update(int index, int newValue) {
		return update(index, newValue, 1, 0, n-1);
	}
}
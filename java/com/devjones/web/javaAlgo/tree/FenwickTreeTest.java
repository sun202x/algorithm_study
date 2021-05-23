package com.devjones.web.javaAlgo.tree;

public class FenwickTreeTest {

}

class FenwickTree {
	int[] tree;
	
	public FenwickTree(int n) {
		tree = new int[n+1];
	}
	
	public int sum(int pos) {
		pos++;
		int ret = 0;
		while(pos > 0) {
			ret += tree[pos];
			pos &= (pos-1);
		}
		
		return ret;
	}
	public void add(int pos, int val) {
		pos++;
		while(pos < tree.length) {
			tree[pos] += val;
			pos += (pos & -pos);
		}
	}
}
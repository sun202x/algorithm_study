package com.devjones.web.javaAlgo.partialSum;

import java.util.Vector;

public class Main01 {

	/**
	 * 주어진 벡터 a의 부분합을 계산한다.
	 * @param a
	 * @return ret
	 */
	public static Vector<Integer> partialSum(Vector<Integer> a) {
		
		Vector<Integer> ret = new Vector<Integer>(a.size());
		
		ret.add(0, a.get(0));
		
		for(int i = 1; i < a.size(); i++) {
			
			ret.add(i, ret.get(i - 1) + a.get(i));
		}
		
		return ret;
	}
	
	/**
	 * 어떤 벡터의 부분합 psum[]이 주어질 때, 원래 벡터의 a부터 b까지의 합을 구한다.
	 * @param psum
	 * @param int a
	 * @param int b
	 */
	public static int rangeSum(Vector<Integer> psum, int a, int b) {
		
		if(a == 0) return psum.get(b);
		
		return psum.get(b) - psum.get(a - 1);
	}
	
	/**
	 * A[]의 제곱의 부분 합 벡터 sqpsum, A[]의 부분 합 벡터 psum이 주어질 때
	 * A[a..b]의 분산을 반환한다.
	 * @param sqpsum
	 * @param psum
	 * @param a
	 * @param b
	 */
	public static double variance(Vector<Integer> sqpsum, Vector<Integer> psum, int a, int b) {
		
		// 우선 해당 구간의 평균을 계산한다.
		double mean = rangeSum(psum, a, b) / (double)(b - a + 1);
		double ret = rangeSum(sqpsum, a, b)
						- 2 * mean * rangeSum(psum, a, b)
						+ (b - a + 1) * mean * mean;
		
		return ret / (b - a + 1);
	}
	
	public static void main(String[] args) {
		
		
	}
}

package com.devjones.web.javaAlgo.partialSum;

public class Main02 {

	/**
	 * 어떤 2차원 배열A[][]의 부분함 psum[][]이 주어질 때,
	 * A[y1, x1]과 A[y2, x2]를 양 끝으로 갖는 부분 배열의 합을 반환한다.
	 * @param psum
	 * @param y1, x1, y2, x2
	 */
	public static int gridSum(int[][] psum, int y1, int x1, int y2, int x2) {
		
		int ret = psum[y2][x2];
		
		if(y1 > 0) ret -= psum[y1 - 1][x2];
		if(x1 > 0) ret -= psum[y2][x1 - 1];
		if(y1 > 0 && x1 > 0) ret += psum[y1 - 1][x1 - 1];
		
		return ret;
	}
	
//	public static int gridSum(Vector<Vector<Integer>> psum, int y1, int x1, int y2, int x2) {
//		
//		return 0;
//	}
	
	public static void main(String[] args) {
		
		int[][] scores = { {92, 53, 32, 12}, {75, 24, 15, 9} };
		
	}
}

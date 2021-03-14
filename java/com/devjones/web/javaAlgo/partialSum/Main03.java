package com.devjones.web.javaAlgo.partialSum;

public class Main03 {

	public static void main(String[] args) {
		
		int[] b = {14, 7, 2, 3, 8, 4, 6, 8, 9, 11};
		
		int result = solution(b);
		
		System.out.println("result = " + result);
	}
	
	static int solution(int[] a) {
		int sol = 0;
		
		for(int i = 0; i < a.length - 1; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				
				sol++;
			}
		}
		
		return sol;
	}
}

package com.devjones.web.javaAlgo.stringArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String h = "hogwarts";
		String n = "gwart";
		
		char[] H = h.toCharArray();
		char[] N = n.toCharArray();
		
		List<Integer> retList = naiveSearch(H, N);
		
		retList.forEach(index -> System.out.print(index + ", "));
	}
	
	static ArrayList<Integer> naiveSearch(char[] H, char[] N) {
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for(int begin = 0; begin + N.length <= H.length; begin++) {
			
			boolean matched = true;
			
			for(int i = 0; i < N.length; i++) {
				if(H[begin + i] != N[i]) {
					matched = false;
					break;
				}
			}
			if(matched) ret.add(begin);
		}
		
		return ret;
	}
}

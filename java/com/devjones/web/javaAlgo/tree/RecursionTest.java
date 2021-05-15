package com.devjones.web.javaAlgo.tree;

public class RecursionTest {

	public static void main(String[] args) {
		
		hello(0);
	}
	
	static void hello(int i) {
		
		if(i > 10)	return;
		
		System.out.println(i + " 번째 hello 호출");
		
		i++;
		
		hello(i);
	}
}

package com.devjones.web.javaAlgo;

/**
 * << 연산자 예제
 */
public class BitOperLeftShift {

	public static void main(String[] args) {
		
		// 모든 비트가 한 비트씩 왼쪽으로 이동할 때마다 그 값은 2배씩 증가한다
		
		// << 기준 왼쪽숫자를 오른쪽숫자만큼 왼쪽으로 이동!
		System.out.println(1 << 3);	// 0001을 왼쪽으로 2칸?
		System.out.println(2 << 1);	// 0010을 왼쪽으로 1칸?
		System.out.println(2 << 2);	
		
		System.out.println(1 << 20);
		System.out.println(20 << 1);
	}
}

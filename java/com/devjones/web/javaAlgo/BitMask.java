package com.devjones.web.javaAlgo;

public class BitMask {

	public static void main(String[] args) {
		
		// 피자집 예제
		// 토핑 종류는 20개를
		// 비트마스크를 이용해 표현해보자.
		
		// 토핑이 아무것도 없는, 즉 공집합을 표현
		int noToppingPizza = 0;
		
		// 20가지 토핑 모두 얹은 피자
		int fullToppingPizza = (1 << 20) - 1;	// << 연산자 설명하기!
		
		// 원소 추가
		int toppings = 0;	// 최초에는 토핑이 아무것도 없음
		int p = 3;	// 원래 p(0<=p<20) 이지만, 여기서는 3이라 가정한다.
		toppings |= (1 << p);
		
		// 원소의 포함 여부 확인
		//System.out.println(toppings & (1 << p));
		if((toppings & (1 << p)) == (1 << p)) System.out.println("pepperoni is in!");
		else if((toppings & (1 << p)) == 0) System.out.println("NO pepperoni!");
		
		// 원소의 삭제
		// toppings -= (1 << p);	toppings의 값이 음수가 됨!
		toppings &= ~(1 << p);		// ~의 의미는?
		
		// 원소의 토글
		toppings ^= (1 << p);
		
		// 두 집합에 대해 연산하기
		/*
		
		
		in
		*/
		
		// 집합의 크기 구하기
		Integer.bitCount(toppings);	// 자바에서 제공함-_-;
		System.out.println(bitCount(toppings));
		
		// 올리브 토핑 추가하기
		int o = 5;
		toppings |= (1 << o);
		
		// 최소 원소 찾기
		System.out.println(toppings);
		// int maxE = Integer.numberOfLeadingZeros(toppings);	// maxE의 값이 26인데, int는 32비트 정수형이 디폴트.
		int minE = Integer.numberOfTrailingZeros(toppings);
		System.out.println("toppings의 최하위 비트는? " + minE);
		
			// 해당비트를 직접구해.
		int firstTopping = (toppings & -toppings);
		System.out.println("firstToppings : " + firstTopping);
		
		// 최소 원소 지우기
		toppings &= (toppings - 1);
		
		// 모든 부분 집합 순회하기
		int subset = toppings;	// subset은 toppings의 부분집합
		subset = (subset - 1) & toppings;
	}
	
	// 집합의 크기 구하기
	public static int bitCount(int x) {
		
		if(x == 0) return 0;
		
		return x % 2 + bitCount(x / 2);
	}
}

package com.devjones.web.javaAlgo.bitMask;

/**
 * ~ 연산자
 * @author dev-jones
 *
 */
public class BitOperNot {

	public static void main(String[] args) {
		
		// ~
		// 비트를 1이면 0으로, 0이면 1로 반전시킴.
		// 비트 NOT 연산
		// 1의 보수
		
		System.out.println(~8);
		System.out.println(~-8);
		
		/*
		결과가  -9인 이유
		~연산을 하면 비트가 반전되지만
		반전된 비트는 왼쪽끝이 1이기때문에 컴퓨터는 음수로 인식
		컴퓨터는 음수인 해당비트를 10진수로 출력하기 위해 2의 보수작업 진행
		2의 보수는 컴퓨터가 음수를 표현하기 위한 방법.
		
		==============
		2의 보수작업
		
			1. 반전되서 나온 결과 비트0111에 1의 보수를 취한다.(비트반전)
			0111 -> 1000
			
			2. 1의 보수를 취한 결과 값에 2의 보수를 취한다.(+1 더하기)
			1000 + 0001 -> 1001
		
			3. 결과 9앞에 -부호를 붙여줘.
			
			※ 따라서 결과는 -9
		*/
	}
}

package com.test;

import java.util.Arrays;

public class CyclicRotation {
	
	public static void main(String[] args) {
		
		int[] A = {1000, 400};
		int K = 3;
		A = solution(A, K);
		Arrays.stream(A).forEach(x -> System.out.print(x + " "));
	}

	
	public static int[] solution(int[] A, int K) {
		int[] b = new int[A.length];
		
		if (K <= 0) {
			return A;
		}
		
		for (int i = 0; i < A.length; i++) {
			b[(K + i) % A.length] = A[i];
		}
		
		return b;
	}
	
}

package com.lessons;

public class MissingElement {

	public static void main(String[] args) {
		int[] A = {};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		
		int sum = 0;
		
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		int total = (A.length + 1) * (A.length + 2) / 2;
		
		return total - sum;
		
	}

}

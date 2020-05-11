package com.test;

import java.math.BigInteger;

public class Test1 {

	public static void main(String[] args) {
		
		int N = 30;
		int K = 4;
		System.out.println(solution(N, K));
	}

	public static int solution(int N, int K) {
		if (N < 0 || K < 0 || N < K) {
			return -1;
		}
		BigInteger[] factorials = getFactorialsArray(N);
		if (factorials[K].equals(0)|| factorials[N - K].equals(0)) {
			return -1;
		}
		BigInteger binomialCoefficient = factorials[N].divide((factorials[K].multiply(factorials[N - K])));
		if (binomialCoefficient.longValue() > 1000000000 || binomialCoefficient.longValue() <= 0) {
			return -1;
		}
		return binomialCoefficient.intValue();
	}

	private static BigInteger[] getFactorialsArray(int n) {
		BigInteger factorials[] = new BigInteger[n + 2];
		factorials[0] = BigInteger.valueOf(1);
		factorials[1] = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++) {
			factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i));
		}
		return factorials;
	}
	

}

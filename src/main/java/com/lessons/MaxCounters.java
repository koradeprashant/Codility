package com.test;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        int[] A = {3, 4, 4, 6, 1, 4, 4};
        
        Arrays.stream(solution(5, A)).forEach(x -> System.out.print(x + " "));

    }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        int max = 0;
        int lastMax = 0;
        for (int i = 0; i < A.length; i++) {
            int X = A[i];
            if (X >= 1 && X <= N) {
                counters[X - 1] = Math.max(counters[X - 1], lastMax);
                counters[X - 1] = counters[X - 1] + 1;
                if (counters[X - 1] > max) {
                    max = counters[X - 1];
                }
            } else if (X == N + 1) {
                lastMax = max;
            }
        }

        for (int k = 0; k < N; k++) {
            counters[k] = Math.max(counters[k], lastMax);
        }

        return counters;
    }

}
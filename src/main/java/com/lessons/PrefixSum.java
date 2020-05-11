package com.lessons;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int A[] = { 6, 3, -2, 4, -1, 0, -5 };

        System.out.println(solution(A, 0, 4));
        System.out.println(solution(A, 0, 6));
        System.out.println(solution(A, 2, 6));
        System.out.println(solution(A, 3, 5));
    }

    public static int solution(int[] A, int i, int j) {

        int[] B = new int[A.length];
        B[0] = A[0];
        for (int k = 1; k < A.length; k++) {
            B[k] = A[k] + B[k - 1];
        }

        Arrays.stream(B).forEach(x -> System.out.print(x + " "));

        return B[j] - (i - 1 >= 0 ? B[i - 1] : 0);
    }

}
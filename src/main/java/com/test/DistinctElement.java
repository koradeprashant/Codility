package com.test;

import java.util.Arrays;

public class DistinctElement {
    

    public static void main(final String[] args) {

        final int A[] = { 2, 1, 1, 2, 3, 1 };

        System.out.println(solution(A));
    }

    public static int solution(final int[] A) {
        int uniqueCount = 1;
        Arrays.sort(A);
        int t = A[0];
        for (final int i : A) {
            if (t != i) {
                uniqueCount++;
                t = i;
            }
        }
        return uniqueCount;
    }

}
package com.test;

import java.util.Arrays;

public class MaxProductOfThree {
    
    public static void main(String[] args) {
        
    }

    public static int solution(int A[]) {
        Arrays.sort(A);

        int n = A.length;
        int neg = A[0] * A[1] * A[n - 1];
        int pos = A[n - 1] * A[n - 2] * A[n - 3];

        return Math.max(neg, pos);

    }

}
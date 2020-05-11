package com.lessons;

public class TapeEqui {

    public static void main(String[] args) {

        int[] A = { 3, 1, 2, 4, 3 };

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;

        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int forwardSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            forwardSum += A[i];
            totalSum = totalSum - A[i];
            int diff = Math.abs(totalSum - forwardSum);
            // System.out.println(totalSum + " - " + forwardSum + " = " + diff);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

}
package com.test;

public class MinAvg2Slice {

    public static void main(String[] args) {

        int[] A = {4, 2, 2, 5, 1, 5, 8};

        System.out.println(solution(A));
        // int minIndex = 0;
        // int[] B = new int[A.length];
        // B[0] = A[0];
        // for (int i = 1; i < A.length; i++) {
        //     B[i] = B[i - 1] + A[i];
        // }

        // int p = 1;
        // int q = 4;

        // double avg = (B[q] - B[p - 1]) * 1.0 / (q - p + 1);
        // System.out.println(avg);

    }

    public static int solution(int[] A) {
        int minIndex = 0;
        int[] B = new int[A.length];
        B[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] + A[i];
        }

        double minAvg = Double.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                double avg = (B[j] - (i - 1 >= 0 ? B[i - 1] : 0)) * 1.0 / (j - i + 1);
                if (avg < minAvg) {
                    minAvg = avg;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }

}
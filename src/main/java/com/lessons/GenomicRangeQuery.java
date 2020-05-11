package com.lessons;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        String s = "CAGCCTA";
        int[] P = { 2, 5, 0 };
        int[] Q = { 4, 5, 6 };

        int[] result = solution(s, P, Q);

        Arrays.stream(result).forEach(x -> System.out.print(x + " "));

    }

    public static int[] solution(String s, int[] P, int[] Q) {

        long start = System.currentTimeMillis();
        int[][] genomPrefixSum = new int[3][s.length() + 1];

        short a, c, g;
        for (int i = 0; i < s.length(); i++) {
            a = c = g = 0;
            if ('A' == s.charAt(i)) {
                a = 1;
            } else if ('C' == s.charAt(i)) {
                c = 1;
            } else if ('G' == s.charAt(i)) {
                g = 1;
            }
            
            genomPrefixSum[0][i + 1] = genomPrefixSum[0][i] + a;
            genomPrefixSum[1][i + 1] = genomPrefixSum[1][i] + c;
            genomPrefixSum[2][i + 1] = genomPrefixSum[2][i] + g;
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int x = P[i] + 1;
            int y = Q[i] + 1;

            if (genomPrefixSum[0][y] - genomPrefixSum[0][x - 1] > 0) {
                result[i] = 1;
            } else if (genomPrefixSum[1][y] - genomPrefixSum[1][x - 1] > 0) {
                result[i] = 2;
            } else if (genomPrefixSum[2][y] - genomPrefixSum[2][x - 1] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        return result;

    }

    // public static int[] solution(String S, int[] P, int[] Q) {
    // // used jagged array to hold the prefix sums of each A, C and G genoms
    // // we don't need to get prefix sums of T, you will see why.
    // int[][] genoms = new int[3][S.length() + 1];
    // // if the char is found in the index i, then we set it to be 1 else they are
    // 0
    // // 3 short values are needed for this reason
    // short a, c, g;
    // for (int i = 0; i < S.length(); i++) {
    // a = 0;
    // c = 0;
    // g = 0;
    // if ('A' == (S.charAt(i))) {
    // a = 1;
    // }
    // if ('C' == (S.charAt(i))) {
    // c = 1;
    // }
    // if ('G' == (S.charAt(i))) {
    // g = 1;
    // }
    // // here we calculate prefix sums. To learn what's prefix sums look at here
    // // https://codility.com/media/train/3-PrefixSums.pdf
    // genoms[0][i + 1] = genoms[0][i] + a;
    // genoms[1][i + 1] = genoms[1][i] + c;
    // genoms[2][i + 1] = genoms[2][i] + g;
    // }

    // for (int i = 0; i < 3; i++) {
    // Arrays.stream(genoms[i]).forEach(x -> System.out.print(x + " "));
    // System.out.println();
    // }

    // int[] result = new int[P.length];
    // // here we go through the provided P[] and Q[] arrays as intervals
    // for (int i = 0; i < P.length; i++) {
    // int fromIndex = P[i] + 1;
    // int toIndex = Q[i] + 1;
    // // if the substring contains a, then genoms[0][toIndex] -
    // genoms[0][fromIndex-1]
    // // > 0
    // if (genoms[0][toIndex] - genoms[0][fromIndex - 1] > 0) {
    // result[i] = 1;
    // } else if (genoms[1][toIndex] - genoms[1][fromIndex - 1] > 0) {
    // result[i] = 2;
    // } else if (genoms[2][toIndex] - genoms[2][fromIndex - 1] > 0) {
    // result[i] = 3;
    // } else {
    // result[i] = 4;
    // }
    // }

    // return result;
    // }

    // public static int[] solution(String s, int[] P, int[] Q) {

    // if (s == null || s.length() == 0 || P == null || P.length == 0 || Q == null
    // || Q.length == 0
    // || Q.length != P.length) {
    // return new int[0];
    // }

    // int[] result = new int[P.length];
    // for (int i = 0; i < P.length; i++) {
    // int start = P[i];
    // int end = Q[i];

    // int min = Integer.MAX_VALUE;
    // for (int j = start; j <= end; j++) {
    // char c = s.charAt(j);
    // int charValue = getCharValue(c);
    // if (charValue < min) {
    // min = charValue;
    // }
    // }
    // result[i] = min;
    // }

    // return result;

    // }

    // private static int getCharValue(char c) {
    //     switch (c) {
    //         case 'A':
    //             return 1;
    //         case 'C':
    //             return 2;
    //         case 'G':
    //             return 3;
    //         case 'T':
    //             return 4;
    //         default:
    //             return Integer.MAX_VALUE;
    //     }
    // }
}
package com.test;

public class PassingCars {

    public static void main(String[] args) {

        int A[] = { 0, 1, 0, 1, 1 };
        System.out.println(solution(A));

        int B[] = { 1, 0, 1, 0, 1, 0, 0, 0 };
        System.out.println(solution(B));
    }

    public static int solution(int A[]) {
        int nuOfPassingCars = 0;
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0 && n == 0) {
                continue;
            }
            if (A[i] == 0) {
                n++;
            } else {
                nuOfPassingCars += n;
                if (nuOfPassingCars > 1000000000) {
                    return -1;
                }
            }
        }
        return nuOfPassingCars;
    }

}
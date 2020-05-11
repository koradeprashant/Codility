package com.test;

public class PassingCars {

    public static void main(String[] args) {

        // int A[] = { 0, 1, 0, 1, 1 };

        // System.out.println(solution(A));

        int B[] = { 1, 0, 1, 0, 1, 0, 0, 0 };
        System.out.println(solution(B));
        System.out.println(solution2(B));
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

    public static int solution2(int[] A) {
        // write your code in Java SE 8
        int countOne = 0;
        int countZero= 0;
        int pair = 0;
        int counter = 0;
        for (int i = A.length-1; i>=0;i--){
            counter++;
            if (A[i]==1){
                countOne++;
            } else if (A[i]==0){
                countZero++;
                pair += counter-countZero;
                if (pair > 1000000000){
                    return -1;    
                }
            }    
        }
        
        return pair;
        
    }

}
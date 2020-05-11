package com.lessons;

public class PermCheck {
    public static void main(String[] args) {
        
        int A[] = {4, 1, 3};

        System.out.println(solution(A));
    }

    public static int solution(int A[]) {

        int N = A.length;
        int totalNSum = N * (N + 1)/ 2;

        int sum = 0;
        for (int i : A) {
            sum += i;
        }

        if (totalNSum - sum == 0) {
            return 1;
        }
        return 0;
    }

}
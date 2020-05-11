package com.test;

public class CountDiv {
    
    public static void main(String[] args) {
        
        System.out.println(solution(6, 11, 3));

    }


    public static int solution(int A, int B, int K) {

        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);

    }


}
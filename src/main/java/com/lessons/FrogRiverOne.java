package com.lessons;

import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
    }

    public static int solution(int X, int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> fallen = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				fallen.add(A[i]);

			if (fallen.size() == X)
				return i;
		}

		return -1;
	}
    
}
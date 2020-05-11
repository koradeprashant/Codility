package com.lessons;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class OddOccurencesArray {

	public static void main(String args[]) {

		int A[] = { 9, 3, 9, 7, 9, 3, 3, 9, 3, 7, 7, 7, 9 };

		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		Map<Integer, Integer> reps = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (reps.containsKey(A[i])) {
				reps.put(A[i], reps.get(A[i]) + 1);
			} else {
				reps.put(A[i], 1);
			}
		}

		Optional<Entry<Integer, Integer>> entry = reps.entrySet().stream().filter(x -> x.getValue() % 2 == 1)
				.findFirst();

		return entry.get().getKey();
	}

}

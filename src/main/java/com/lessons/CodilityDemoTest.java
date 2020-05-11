package com.lessons;

import java.util.HashSet;
import java.util.Set;

public class CodilityDemoTest {
	
	public static void main(String args[]) {
		
		
		
	}
	
	public static int smallestInt(int[] A) {
		
		Set<Integer> uniq = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			uniq.add(A[i]);
		}
		
		for (int i = 1; i < A.length + 1; i++) {
			if (!uniq.contains(i)) {
				return i;
			}
		}
		
		return A.length + 1;
	}

}

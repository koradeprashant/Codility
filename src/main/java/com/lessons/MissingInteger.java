package com.lessons;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    
    public static void main(String[] args) {
        
    }

    public static int solution(int[] A) {

        Set<Integer> uniq = new HashSet<>();
        for (int element : A) {
            if (element > 0) {
                uniq.add(element);
            }
        }

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (!uniq.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}
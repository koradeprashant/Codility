package com.test;

public class BinaryGap {

	public static void main(String[] args) {
		
		System.out.println(solution(328));
		
	}

	public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        int length = binary.length();
        
        int maxGap = 0;
        int count = 0;
        
        for (int i = 0; i < length; i++) {
        	if (binary.charAt(i) == '1') {
        		if (count > maxGap) {
        			maxGap = count;
        		}
        		count = 0;
        	} else 
        		count++;
        }
        
        return maxGap;
    }
	
}

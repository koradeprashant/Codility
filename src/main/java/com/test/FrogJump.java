package com.test;

public class FrogJump {
	
	public static void main(String args[]) {
		
		System.out.println(solution(10, 85, 30));
		// System.out.println(solution(1, 1, 3));
		//-10, 0, -30
	}
	
	public static int solution(int x, int y, int d) {
		
		if ((y - x) % d == 0) {
		    return (y - x) / d;
		}
		return (y - x) / d + 1;
		
//		if (x >= y || (y >= 0 && d < 0)) {
//			return 0;
//		}
//		
//		int count = 0;
//		for (int i = 2; i < 1000000000; i++) {
//			if (x + (d * i) >= y) {
//				count = i;
//				break;
//			}
//		}
//		
//		return count;
	}

}

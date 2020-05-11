package com.test;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		
		int A[][] = new int[1][1];

		A[0][0] = -502;
//		A[0][1] = 4;
//		A[0][2] = 4;
//		A[1][0] = 4;
//		A[1][1] = 3;
//		A[1][2] = 4;
//		A[2][0] = 3;
//		A[2][1] = 2;
//		A[2][2] = 4;
//		A[3][0] = 2;
//		A[3][1] = 2;
//		A[3][2] = 2;
//		A[4][0] = 3;
//		A[4][1] = 3;
//		A[4][2] = 4;
//		A[5][0] = 1;
//		A[5][1] = 4;
//		A[5][2] = 4;
//		A[6][0] = 4;
//		A[6][1] = 1;
//		A[6][2] = 1;

		System.out.println(new Test2().solution(A));

	}
	
	public int solution2(int[][] A) {
		if (A == null || A.length == 0 || A[0].length == 0) {
			return 0;
		}
		
		int N = A.length;
		int M = A[0].length;

		int numberOfCountries = 0;
		
		
		
		return numberOfCountries;
		
	}
	
	
	

	public int solution(int[][] A) {
		if (A == null || A.length == 0 || A[0].length == 0) {
			return 0;
		}
		
		int N = A.length;
		int M = A[0].length;

		int numberOfCountries = 0;
		
		List<Integer> colors = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!colors.contains(A[i][j])) {
					colors.add(A[i][j]);
				}
			}
		}
		for (Integer color : colors) {
			boolean visited[][] = new boolean[N][M];
			int count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (A[i][j] == color && !visited[i][j]) {
						DFS(A, color, visited, i, j);
						count++;
					}
				}
			}
			numberOfCountries += count;
		}

		return numberOfCountries;
	}

	int allowedRowJump[] = new int[] { -1, 0, 0, 1 };
	int allowedColJump[] = new int[] { 0, -1, 1, 0 };

	void DFS(int A[][], int row, int col, boolean visited[][], int color) {
		int N = A.length;
		int M = A[0].length;
		visited[row][col] = true;
		for (int k = 0; k < 4; k++) {
			int r = row + allowedRowJump[k];
			int c = col + allowedColJump[k];
			if ((r >= 0) && (r < N) && (c >= 0) && (c < M) && (A[r][c] == color && !visited[r][c])) {
				DFS(A, r, c, visited, color);
			}
		}
	}

	public void DFS(int[][] grid, int color, boolean[][] visited, int i, int j) {
		int N = grid.length;
		if (N == 0)
			return;
		int M = grid[0].length;

		Stack<Point> stack = new Stack<>();

		stack.push(new Point(i, j));

		while (!stack.empty()) {
			Point location = stack.pop();
			int row = location.x;
			int col = location.y;
			
			if ((row >= 0) && (row < N) && (col >= 0) && (col < M) && (grid[row][col] == color && !visited[row][col])) {
				visited[row][col] = true;
				stack.push(new Point(row - 1, col));
				stack.push(new Point(row, col - 1));
				stack.push(new Point(row, col + 1));
				stack.push(new Point(row + 1, col));
			}
			
		}
	}

}

package com.sandipan.aich.study.plan.datastructure1;

public class ReshapeTheMatrix {

	public int[][] matrixReshape(int[][] mat, int r, int c) {

		int rorig = mat.length;
		int corig = mat[0].length;
		if ((rorig * corig) != (r * c))
			return mat;

		int[][] newMat = new int[r][c];

		int R = 0;
		int C = 0;
		for (int i = 0; i < rorig; i++) {
			for (int j = 0; j < corig; j++) {
				newMat[R][C] = mat[i][j];
				C++;
				if (C == c) {
					C = 0;
					R++;
				}
			}
		}
		return newMat;
	}
}

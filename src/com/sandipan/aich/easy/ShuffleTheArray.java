package com.sandipan.aich.easy;

public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {

		int[] result = new int[2 * n];

		for (int i = 0, j = n, k = 0; i < n; i++, j++, k += 2) {
			result[k] = nums[i];
			result[k + 1] = nums[j];
		}
		return result;
	}
}

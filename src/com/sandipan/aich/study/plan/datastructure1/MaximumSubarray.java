package com.sandipan.aich.study.plan.datastructure1;

public class MaximumSubarray {
	
	public int maxSubArray(int[] array) {
		int size = array.length;
		int max = array[0];
		int max_current = array[0];

		for (int i = 1; i < size; i++) {
			max_current = Math.max(array[i], max_current + array[i]);
			if (max < max_current)
				max = max_current;
		}
		return max;
	}
}

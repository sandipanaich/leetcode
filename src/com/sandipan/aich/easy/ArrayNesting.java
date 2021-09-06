package com.sandipan.aich.easy;

public class ArrayNesting {

	public static void main(String[] args) {
		System.out.println(arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 }));
		System.out.println(arrayNesting(new int[] { 0, 1, 2 }));
	}

	public static int arrayNesting(int[] nums) {

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = nests(nums, i, i);
			if (max < count)
				max = count;
		}
		return max;
	}

	private static int nests(int[] nums, int i, int start) {
		if (nums[i] == start)
			return 1;
		return 1 + nests(nums, nums[i], start);
	}
}

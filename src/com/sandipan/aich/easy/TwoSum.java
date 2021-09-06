package com.sandipan.aich.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		int[] solution = new int[] { -1, -1 };
		Map<Integer, Integer> valueIndexMap = new HashMap<>();
		int len = nums.length;

		for (int i = 0; i < len; i++) {
			int num = nums[i];

			if (valueIndexMap.containsKey(target - num)) {
				return new int[] { valueIndexMap.get(target - num), i };
			} else {
				valueIndexMap.put(num, i);
			}
		}
		return null;
	}
}

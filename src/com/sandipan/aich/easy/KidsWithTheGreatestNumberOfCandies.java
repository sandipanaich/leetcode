package com.sandipan.aich.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString("1.1.1.1".split("\\.")));
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> list = new ArrayList<Boolean>();

		int max = 0;
		for (int c : candies) {
			if (max < c)
				max = c;
		}

		for (int c : candies)
			list.add((c + extraCandies) >= max);

		return list;
	}
}

package com.sandipan.aich.easy;

public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		
		int max = 0;
		for (int[] array : accounts) {
			int sum = 0;
			for (int wealth : array)
				sum += wealth;

			if (max < sum)
				max = sum;
		}
		return max;
	}
}

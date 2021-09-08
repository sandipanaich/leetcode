package com.sandipan.aich.daily;

public class MergeSortedArray {
	
	public static final void merge(int[] nums1, int m, int[] nums2, int n) {

		int last = m + n - 1;
		for (int i = m - 1, j = n - 1; last >= 0;) {
			if (i >= 0 && ((j < 0) || nums1[i] >= nums2[j]))
				nums1[last] = nums1[i--];
			else if (j >= 0)
				nums1[last] = nums2[j--];
			last--;
		}
	}
}

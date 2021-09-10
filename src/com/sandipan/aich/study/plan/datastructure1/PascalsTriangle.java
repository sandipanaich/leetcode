package com.sandipan.aich.study.plan.datastructure1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();

		res.add(Arrays.asList(1));
		if (numRows == 1)
			return res;

		// res.add(Arrays.toList(1, 1));
		// if(numRows == 2)
		// return res;

		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);

			List<Integer> prev = res.get(i - 1);
			for (int j = 1; j < prev.size(); j++)
				list.add(prev.get(j - 1) + prev.get(j));

			list.add(1);
			res.add(list);
		}
		return res;
	}
}

package com.sandipan.aich.study.plan.datastructure1;

import java.util.Stack;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		Stack<Integer> stack = new Stack<>();

		stack.push(0);
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[stack.peek()])
				profit = Math.max(profit, prices[i] - prices[stack.peek()]);

			while (!stack.isEmpty() && prices[stack.peek()] > prices[i])
				stack.pop();

			if (stack.isEmpty())
				stack.push(i);
		}
		return profit;
	}
}

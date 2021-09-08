package com.sandipan.aich.easy;

import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;
			case ')':
			case '}':
			case ']':
				if (stack.size() == 0 || stack.pop() != opposite(c))
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

	private static final char opposite(char c) {
		if (c == ')')
			return '(';
		if (c == '}')
			return '{';
		if (c == ']')
			return '[';
		return ' ';
	}
}

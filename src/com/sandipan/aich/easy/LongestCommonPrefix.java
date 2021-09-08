package com.sandipan.aich.easy;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {

		String str = "";
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length() || strs[j].charAt(i) != c)
					return str;
			}
			str += c;
		}
		return str;
	}
}

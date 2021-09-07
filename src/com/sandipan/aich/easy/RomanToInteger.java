package com.sandipan.aich.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	private static final Map<Character, Integer> map = new HashMap<>();

	 static
	 {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static final int romanToInt(String s) {
		char[] str = s.toCharArray();
		int last = s.length() - 1;
		int num = 0;

		for (int i = 0; i < last; i++) {
			int value = map.get(str[i]);
			int next = map.get(str[i + 1]);
			if (value >= next)
				num += value;
			else
				num -= value;
		}
		num += map.get(str[last]);

		return num;
	}
}

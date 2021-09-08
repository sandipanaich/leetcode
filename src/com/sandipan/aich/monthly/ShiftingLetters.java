package com.sandipan.aich.monthly;

public class ShiftingLetters {

	public static void main(String[] args) {
		System.out.println(shiftingLetters("abc", new int[] { 1, 1, 1 }));
		System.out.println(shiftingLetters("abc", new int[] { 3, 5, 9 }));
		System.out.println(shiftingLetters("aaa", new int[] { 1, 2, 3 }));
		System.out.println(shiftingLetters("xyz", new int[] { 1, 1, 1 }));
		System.out.println(shiftingLetters("xyz", new int[] { 1, 2, 3 }));
		System.out.println(shiftingLetters("bad", new int[] { 10, 20, 30 }));

		System.out.println(shiftingLetters("mkgfzkkuxownxvfvxasy",
				new int[] { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950,
						81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837,
						622939912, 116899933, 983296461, 536563513 }));
	}

	public static final String shiftingLetters(String s, int[] shifts) {

		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++)
			str[i] -= 'a';

		for (int i = shifts.length - 1; i >= 0; i--) {

			long intChar = str[i] + shifts[i];

			intChar = intChar % ('z' - 'a' + 1);
			str[i] = (char) (intChar + 'a');

			if (i > 0) {
				shifts[i - 1] += shifts[i];
				shifts[i - 1] %= ('z' - 'a' + 1);
			}
		}
		return new String(str);
	}
}

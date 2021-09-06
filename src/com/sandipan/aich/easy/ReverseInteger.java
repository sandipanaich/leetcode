package com.sandipan.aich.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
		System.out.println(reverse(2147483646));
		System.out.println(reverse(-2147483646));
	}

	public static int reverse(int x) {

		int num = 0;

		while (x != 0) {
			if (x > 0 && ((Integer.MAX_VALUE - x % 10) / 10) < num)
				return 0;
			if (x < 0 && ((Integer.MIN_VALUE - x % 10) / 10) > num)
				return 0;

			num = num * 10 + x % 10;
			x /= 10;
		}
		return num;
	}
}

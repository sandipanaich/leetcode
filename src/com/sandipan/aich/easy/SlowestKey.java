package com.sandipan.aich.easy;

public class SlowestKey {

	public static void main(String[] args) {
		System.out.println(slowestKey(new int[] { 9, 29, 49, 50 }, "cbcd"));
		System.out.println(slowestKey(new int[] { 12, 23, 36, 46, 62 }, "spuda"));
		System.out.println(slowestKey(new int[] { 1, 2 }, "ab"));
	}

	public static char slowestKey(int[] releaseTimes, String keysPressed) {

		int last = releaseTimes.length - 1;
		int index = last;

		for (int i = last; i > 0; i--) {
			releaseTimes[i] = releaseTimes[i] - releaseTimes[i - 1];
			if (releaseTimes[i] > releaseTimes[index])
				index = i;
			if (releaseTimes[i] == releaseTimes[index]) {
				index = (keysPressed.charAt(i) > keysPressed.charAt(index)) ? i : index;
			}
		}

		if (releaseTimes[0] > releaseTimes[index])
			return keysPressed.charAt(0);
		else if (releaseTimes[0] < releaseTimes[index])
			return keysPressed.charAt(index);
		else {
			return (keysPressed.charAt(index) > keysPressed.charAt(0)) ? keysPressed.charAt(index)
					: keysPressed.charAt(0);
		}
	}
}

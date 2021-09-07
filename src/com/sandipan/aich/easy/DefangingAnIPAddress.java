package com.sandipan.aich.easy;

public class DefangingAnIPAddress {

	public String defangIPaddr(String address) {

		char[] ip = new char[address.length() + 6];
		for (int i = 0, j = 0; i < address.length(); i++, j++) {
			if (address.charAt(i) == '.') {
				ip[j] = '[';
				ip[++j] = '.';
				ip[++j] = ']';
			} else
				ip[j] = address.charAt(i);
		}

		return new String(ip);

		// String[] array = address.split("\\.");
		// return array[0] + "[.]" + array[1] + "[.]" + array[2] + "[.]" + array[3];
	}
}

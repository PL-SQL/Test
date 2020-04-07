package com.pl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Test1 t = new Test1();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("one", "1");

		int aa[] = { 1, 2, 4, 5, 6 };

		t.rep(map);
		t.rep(aa);
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
		// System.out.println(map);

	}

	private void rep(int[] aa) {
		int[] aa2 = new int[] {};
		aa2 = aa;
		aa2[0] = 100;
	}

	private void rep(Map<String, Object> map) {
		map.clear();

		// System.err.println(map);
	}

}

package com.pl;
import java.util.HashMap;
import java.util.Map;

public class ttt {
	public static void main(String[] args) {
		double s1 = 128.0;
		Double s2 = 128.0;

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("key", 128.0);

		System.out.println(map.get("key") != s1);
	}
}

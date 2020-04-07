package com.pl;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ddd {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		nf.setGroupingUsed(false);
		double s = 81234563.22222222;
		System.out.println(nf.format(s));
	}
}

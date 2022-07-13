package com.Testng;

import org.testng.annotations.Test;

public class SimpleTest {

	private int param;

	public SimpleTest(int i) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testMethodOne() {

		int opValue = param + 1;
		System.out.println("Test method one output: " + opValue);
	}

	@Test
	public void testMethodTwo() {

		int opValue = param + 2;
		System.out.println("Test method Two output:" + opValue);
	}

}

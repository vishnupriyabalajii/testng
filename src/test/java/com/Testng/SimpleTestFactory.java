package com.Testng;

import org.testng.annotations.Factory;

public class SimpleTestFactory {

	@Factory
	private Object[] factorymethod() {

return new Object[] {new SimpleTest(0), new SimpleTest(1)};
	
	}
}

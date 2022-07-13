package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Orderplacement{
	
	@Test(retryAnalyzer = MyRetry.class)
	private void iphoneOrder() {
		System.out.println("Ordered Iphone");
		Assert.assertEquals("201", "403");

	}
	
	@Test
	private void samsungOrder() {
		System.out.println("Samsung Iphone");
		Assert.assertEquals("201", "403");

	}
	

}

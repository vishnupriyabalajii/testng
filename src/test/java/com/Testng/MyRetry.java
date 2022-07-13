package com.Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
	
	int maxLimit=5;
	int count=1;

	@Override
	public boolean retry(ITestResult result) {
		if (maxLimit>count) {
			count++;
			return true;
			
			
		}
		
		return false;
	}

}

package org.testng;

import org.testng.annotations.Test;

public class Priorityclass {
	
	@Test(dataProvider = "Key",dataProviderClass = SampleTest.class)
	private void tc1(String g) {
		
		System.out.println(g);
	}
	@Test(priority = -5)
	private void tc6() {
		
		System.out.println("The testcase is passed .....6");
	}
	@Test(priority = 1)
	private void tc2() {
		
		System.out.println("The testcase is passed .....2");
	}
	@Test(priority = -8)
	private void tc4() {
		
		System.out.println("The testcase is passed .....4");
	}
}

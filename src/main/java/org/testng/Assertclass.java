package org.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertclass extends Baseclass{
	
	
	
	@BeforeClass
	private void Launch() {
		Launchbrowser();
	}
	
	@AfterClass
	private void quit() {
		close();
	}
	@Test
	
	private void tc1() {
		
		
		OpenURL("https://www.facebook.com/");
		
		@Nullable
		String title = driver.getTitle();
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("Sureshkumar");
		
		Assert.assertTrue(title.contains("facebook"), "Check the page Title");
		
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys("Sureshkumar");

	}
	
	@Test
	
private void tc2() {
		
		
		OpenURL("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("Sureshkumar");
		
		SoftAssert st = new SoftAssert();
		
		st.assertTrue(title.contains("facebook"), "Check the page Title");
		
		
		
		
		
		
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys("Sureshkumar");

	}
	
}
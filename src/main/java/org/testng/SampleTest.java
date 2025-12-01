package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest extends Baseclass {

	@DataProvider(name = "Sample")
	private Object[][] data() {
		return new Object[][] {

				{ "Sureshjamr", "154785" }, { "Suresh", "58744" }, { "Sureshmr", "358744" }, };
	}

	@Test(dataProvider = "Sample")
	private void tc1(String u, String p) {
		OpenURL("https://www.facebook.com/");
		

		driver.findElement(By.id("email")).sendKeys(u);

		driver.findElement(By.name("pass")).sendKeys(p);

	}

	@Test
	private void tc6() {
		OpenURL("https://www.instagram.com/");

	}
@DataProvider(name ="Key")
	public Object[][] Myntra() {
		return new Object[][] { { "Football" }, { "Pendrive" }, { "Jeans" }, { "Shirts" },

		};

	}

	@Test(dataProvider = "Key")
	private void tc3(String e) throws AWTException {
		OpenURL("https://www.myntra.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		element.sendKeys(e);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	@BeforeMethod
	private void startdate() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	private void enddate() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	private void Launchthebrowser() {

		Launchbrowser();
		System.out.println(Thread.currentThread().getId());
	}

	@AfterClass
	private void quitBrowser() {
		close();
	}
}

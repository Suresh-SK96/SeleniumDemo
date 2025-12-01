package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	
	@Test
	private void tc1() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("Sureshkumar");
		
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys("123546");

	}
	
@Test
private void tc2() throws AWTException {
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	
	WebElement element = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	element.sendKeys("Cricket");
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}

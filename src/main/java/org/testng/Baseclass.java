package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Baseclass {
	
	public WebDriver driver;
	
	public void Launchbrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public void OpenURL(String URL) {
		
		driver.get(URL);

	}
	
	public void Passkey(String text,WebElement ele) {
		
		ele.sendKeys(text);

	}

	public void Click(WebElement ele) {
		ele.click();

	}
	
	public void close() {
		driver.quit();

	}

	public void browser() {
		// TODO Auto-generated method stub
		
	}
	
}

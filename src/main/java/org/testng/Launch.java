package org.testng;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://workspace.google.com/intl/en-US/gmail/");
		
		Driver.manage().window().maximize();
		
		@Nullable
		String title = Driver.getTitle();
		
		System.out.println(title);
		
		@Nullable
		String currentUrl = Driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		Driver.quit();
		
	}

}

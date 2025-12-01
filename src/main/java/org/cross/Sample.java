package org.cross;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.javascript.jscomp.ChromeCodingConvention;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	@Parameters("Browser")
	@Test
	private void tc1(String BN) {
		
//		if(BN.equals("Chromebrowser")) {
//			
//			WebDriver Driver;
//			
//			WebDriverManager.chromedriver().setup();
//			Driver = new ChromeDriver();
//			
//		}
//		else {
//            WebDriver Driver;
//			
//			WebDriverManager.firefoxdriver().setup();
//			Driver = new FirefoxDriver();
//		}
		WebDriver Driver = null;
		if (BN.equals("Chromebrowser")) {
			
			
			
		WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		}
		
		else if (BN.equals("Firefoxbrowser")) {
			
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
			
		}
		
			
		
	Driver.get("https://www.facebook.com/");
	
	
		} 
		
		
		
		
	}

	
		
		



package org.testng;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver Driver = new ChromeDriver();

		Driver.get("https://demo.automationtesting.in/Alerts.html");

		Driver.manage().window().maximize();

		Thread.sleep(3000);//button[@class='btn btn-danger']
		
		WebElement element = Driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		element.click();
		
		WebElement element1 = Driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		element1.click();
		
		Driver.switchTo().alert().dismiss();
		
		WebElement element2 = Driver.findElement(By.xpath("//p[@id='demo']"));
		String text = element2.getText();
		System.out.println(text);
		
        WebElement element3 = Driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		element3.click();
		
        WebElement element4 = Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
        element4.click();
        
        Alert alert = Driver.switchTo().alert();
        
        String text2 = alert.getText();
        
        System.out.println(text2);
        
        alert.sendKeys("learning automation");
        
        alert.accept();
        
        WebElement element5 = Driver.findElement(By.xpath("//p[@id='demo1']"));
		String text3 = element5.getText();
		System.out.println(text3);
        
        
		
		
		
		
		

	}

}

package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocLinkText {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("jay@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
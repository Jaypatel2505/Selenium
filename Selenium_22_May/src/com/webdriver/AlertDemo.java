package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\JAYKPATE\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1 = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a1.getText());
		
//		a1.dismiss();
		a1.accept();
		Thread.sleep(2000);
		
		Alert a2 = driver.switchTo().alert();
		System.out.println("Alert Message : "+a2.getText());
		
		a2.accept();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
package com.webdriver;
import org.openqa.selenium.By;
/*
 * Syntax : //tagname[@attr_name='attr_value']
 * 			//tagname[text()='text-value']
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicXPath {
	public static void main(String[] args) throws InterruptedException{
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
		Thread.sleep(2000);
		
		String msg = driver.findElement(By.xpath("//b[text()='Testing']")).getText();
		System.out.println("Text is :"+msg);
		Thread.sleep(2000);
		
		driver.close();
	}
}
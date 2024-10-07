package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * CSS Attribute: Except CLASS and ID everything else is attribute.
 * Syntax : tagname[attr_name = 'attr_value']
 */
public class Loc_CSS_Attribute {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("jay@mail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password'")).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[value='1']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
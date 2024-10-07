package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinkDemo {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.get("file:///C:\\Users\\jgpatel\\eclipse-workspace\\Selenium_22_May\\src\\com\\webdriver\\index1.html");		// Html file call code
//		driver.findElement(By.partialLinkText("Click")).click();	// Html Element finding code
		driver.get("https://www.geeksforgeeks.org/");
		driver.findElement(By.partialLinkText("d")).click();
		Thread.sleep(10000);
		driver.close();
	}
}

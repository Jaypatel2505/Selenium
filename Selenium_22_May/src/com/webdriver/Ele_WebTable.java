package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ele_WebTable {
	public static void main(String[] args) throws InterruptedException{
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\JAYKPATE\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("file:///C:\\Users\\Vinay\\git\\repository\\Selenium_22_May\\src\\com\\webdriver\\index3.html");
		Thread.sleep(2000);
		
		for (int i = 2; i <=5; i++) {
			for (int j = 1; j <=4; j++) {
				String data=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("   |  "+data);
	 		}
			System.out.println();
			Thread.sleep(2000);
	 	}
		driver.quit();
	}
}
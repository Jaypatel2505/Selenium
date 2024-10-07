package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ele_DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\JAYKPATE\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement>tr = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("No Of Rows : "+tr.size());
		
		List<WebElement>th = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/th"));
		System.out.println("No Of Columns : "+th.size());
		
		for (int i = 1; i <=tr.size(); i++) {
			for (int j = 1; j <= th.size(); j++) {
				String data = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(" | "+data);
			}
			System.out.println();
			Thread.sleep(2000);
		}
		
		
		driver.quit();
	}
}

package com.webdriver;
/*
 * Select by Index
 * Select by Value
 * Select by visible text
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_MultiSelect {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.id("fruits"));
		
		Select s1 = new Select(e1);
		
		s1.selectByIndex(1);
		Thread.sleep(2000);
		
		s1.selectByValue("grape");
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Banana");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
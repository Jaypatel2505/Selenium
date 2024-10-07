package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ele_Keyboard {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\JAYKPATE\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement fname=driver.findElement(By.name("firstName"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(fname)
				.keyDown(fname, Keys.SHIFT)
				.sendKeys("jay")
				.keyUp(fname,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		
		a1.perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
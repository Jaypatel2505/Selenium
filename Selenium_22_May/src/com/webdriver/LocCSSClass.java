package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * CSS Class:
 * Syntax : <tagname>.<class_value>(input.input_error.form_input)
 * - Use . when class have space
 */
public class LocCSSClass {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
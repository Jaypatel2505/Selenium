package com.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {
	public static void main(String[] args) throws InterruptedException {
		//Browser setup
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\JAYKPATE\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jgpatel\\Desktop\\Automation\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//To open Empty browser
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
		
		//To open a website(Edge)
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		System.out.println("The Edge URL is: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("The Edge Title is: "+driver.getTitle());
		driver.quit();				// To close browser
		
		//(Chrome)
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		System.out.println("The Chrome URL is: "+driver1.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("The Chrome Title is: "+driver1.getTitle());
		driver1.quit();				// To close browser
		
		//(Firefox)
//		WebDriver driver2 = new FirefoxDriver();
//		driver2.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
//		System.out.println("The URL is: "+driver2.getCurrentUrl());
//		Thread.sleep(2000);
//		System.out.println("The Title is: "+driver2.getTitle());
//		driver.quit();				// To close browser
		
		//driver.close();			// To close a tab
	}
}
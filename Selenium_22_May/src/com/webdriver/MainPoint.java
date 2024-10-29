package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPoint {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		
//		Actions zoomout=new Actions(driver);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		zoomout.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();
		JavascriptExecutor zoomout = (JavascriptExecutor) driver;
		zoomout.executeScript("document.body.style.zoom='75%'");
		
		//Element Option Click
		/*driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(2000);*/
		
		// Text Box Option
		/*driver.findElement(By.id("item-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control")).sendKeys("Jay Patel");			// Class Name
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("Jay@mail.com");			// ID
		Thread.sleep(2000);
		driver.findElement(By.id("currentAddress")).sendKeys("Amroli, Surat - 394107");			// ID
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.id("currentAddress"));			// COPY & PASTE
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(fname).doubleClick().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build();
		a1.perform();
		driver.findElement(By.id("submit")).click();			// ID
		Thread.sleep(2000);*/
		
		//CheckBox Option
		/*driver.findElement(By.id("item-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='Expand all']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='tree-node-wordFile']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='tree-node-angular']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='tree-node-desktop']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();		// LocXPath
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[title='Collapse all']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);*/
		
		//RadioButton Option
		/*driver.findElement(By.id("item-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='yesRadio']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='impressiveRadio']")).click();		// CSS Selector with attribute(Input With ID Not working)
		Thread.sleep(2000);*/
		
		//Web Tables Option
		/*driver.findElement(By.id("item-3")).click();
		Thread.sleep(2000);
		WebElement searc=driver.findElement(By.id("searchBox"));			// Add new & update string
		Actions actions=new Actions(driver);
		actions.moveToElement(searc).click().sendKeys("Cierra").build().perform();
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("Cantrell").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("29").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("alden@example.com").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("10000").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		actions.sendKeys("Compliance").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
//		actions.keyDown(Keys.DELETE).build().perform();
//		Thread.sleep(2000);
		
//		for (int i = 0; i < 15; i++) {															//This Shows entries 15 Times
//			driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Jay");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Patel");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Jay@mail.com");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='age']")).sendKeys("23");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2300000");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Compliance");		// CSS Selector with attribute
//			driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
//		}
		
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Jay");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Patel");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Jay@mail.com");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("23");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2300000");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Compliance");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("span[id='edit-record-4']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("AJay");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("atel");		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='delete-record-4']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);*/
		
		//Button Option
		/*driver.findElement(By.id("item-4")).click();
		Thread.sleep(2000);
		
		WebElement clic=driver.findElement(By.id("doubleClickBtn"));
		Actions clicactions=new Actions(driver);
		clicactions.moveToElement(clic).doubleClick().build().perform();
		Thread.sleep(2000);
		
		WebElement conclic=driver.findElement(By.id("rightClickBtn"));
		Actions conclicactions=new Actions(driver);
		conclicactions.moveToElement(conclic).contextClick().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();		// Dynamic X Path
		Thread.sleep(2000);*/
		
		//Link Option
		/*//Static Link with new page
		driver.findElement(By.id("item-5")).click();
		Thread.sleep(2000);
		String main_window= driver.getWindowHandle();
		System.out.println("main window :"+main_window);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		Set<String> all_window= driver.getWindowHandles();		//Iterator
		Iterator<String> i1=all_window.iterator();
		while (i1.hasNext()) {
			String child_window = (String) i1.next();
			System.out.println("child window :"+child_window);
			if(!main_window.equals(child_window)) {
				driver.switchTo().window(child_window);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_window);
		//Dynamic Link with new page
		String main_window1= driver.getWindowHandle();
		System.out.println("main window :"+main_window1);
		driver.findElement(By.cssSelector("a[id='dynamicLink']")).click();		// CSS Selector with attribute
		Thread.sleep(5000);
		Set<String> all_window1= driver.getWindowHandles();
		Iterator<String> i2=all_window1.iterator();
		while (i2.hasNext()) {
			String child_window1 = (String) i2.next();
			System.out.println("child window :"+child_window1);
			if(!main_window1.equals(child_window1)) {
				driver.switchTo().window(child_window1);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_window1);
		//API call with same page
		driver.findElement(By.cssSelector("a[id='created']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='no-content']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='moved']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='bad-request']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='unauthorized']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='forbidden']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='invalid-url']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);*/
		
		//Broken Links - Images
		/*driver.findElement(By.id("item-6")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']")).click();		// Dynamic X Path
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']")).click();		// Dynamic X Path
		Thread.sleep(2000);
		driver.navigate().back();*/
		
		//Download & Upload
		/*driver.findElement(By.id("item-7")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='downloadButton']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		WebElement upload =driver.findElement(By.id("uploadFile"));
		upload.sendKeys("C:\\Users\\JAYKPATE\\Downloads\\sampleFile.jpeg");*/
		
		//Dynamic Properties
		/*driver.findElement(By.id("item-8")).click();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 40);
//		String msg1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.mt-4.text-danger.btn.btn-primary");
//		System.out.println("Button color changed to "+msg1);
		String msg=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Visible After 5 Seconds']"))).getText();
		System.out.println("text "+msg);*/
		
//		Thread.sleep(5000);
//		driver.quit();
		
		//Forms Option Click
		/*driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		Thread.sleep(2000);
		//Practice Form
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Jay");			// ID
		Thread.sleep(2000); 
		driver.findElement(By.id("lastName")).sendKeys("Patel");			// ID
		Thread.sleep(2000); 
		driver.findElement(By.id("userEmail")).sendKeys("Jay@mail.com");			// ID
		Thread.sleep(2000); 
		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		driver.findElement(By.id("userNumber")).sendKeys("9087654321");			// ID
		Thread.sleep(2000);  
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();		// CSS Selector with attribute
		Thread.sleep(2000);
		WebElement uploadfile =driver.findElement(By.id("uploadPicture"));
		uploadfile.sendKeys("C:\\Users\\JAYKPATE\\Downloads\\sampleFile.jpeg");
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("Amroli, Surat-394107");		// CSS Selector with attribute
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("state"));
		Select s1 = new Select(e1);
		s1.selectByIndex(2);*/
		
		//Alerts, Frame & Windows option Click
		/*driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		Thread.sleep(2000);
		String main_tab= driver.getWindowHandle();
		System.out.println("main window :"+main_tab);
		driver.findElement(By.cssSelector("button[id='tabButton']")).click();		// CSS Selector with attribute
		Thread.sleep(5000);
		Set<String> all_tab= driver.getWindowHandles();
		Iterator<String> i2=all_tab.iterator();
		while (i2.hasNext()) {
			String child_tab = (String) i2.next();
			System.out.println("child window :"+child_tab);
			if(!main_tab.equals(child_tab)) {
				driver.switchTo().window(child_tab);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_tab);
		Thread.sleep(2000);
		String main_new_window= driver.getWindowHandle();
		System.out.println("main window :"+main_new_window);
		driver.findElement(By.cssSelector("button[id='windowButton']")).click();		// CSS Selector with attribute
		Thread.sleep(5000);
		Set<String> all_new_window= driver.getWindowHandles();
		Iterator<String> i3=all_new_window.iterator();
		while (i3.hasNext()) {
			String child_new_window = (String) i3.next();
			System.out.println("child window :"+child_new_window);
			if(!main_tab.equals(child_new_window)) {
				driver.switchTo().window(child_new_window);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_new_window);
		Thread.sleep(2000);
		String main_new_window_msg= driver.getWindowHandle();
		System.out.println("main window :"+main_new_window_msg);
		driver.findElement(By.cssSelector("button[id='messageWindowButton']")).click();		// CSS Selector with attribute
		Thread.sleep(5000);
		Set<String> all_new_window_msg= driver.getWindowHandles();
		Iterator<String> i4=all_new_window_msg.iterator();
		while (i4.hasNext()) {
			String child_new_window_msg = (String) i4.next();
			System.out.println("child window :"+child_new_window_msg);
			if(!main_tab.equals(child_new_window_msg)) {
				driver.switchTo().window(child_new_window_msg);
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(main_new_window_msg);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Alert a = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a.getText());
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
//		driver.findElement(By.id("timerAlertButton")).click();
//		Alert a1 = driver.switchTo().alert();	
//		System.out.println("Timer Alert Message : "+a1.getText());
//		Thread.sleep(2000);
//		WebDriverWait wait=new WebDriverWait(driver, 40);
//		String msg=	wait.until(ExpectedConditions.visibilityOfElementLocated(driver.switchTo().alert())).getText();
//		System.out.println(msg);
//		a1.accept();
//		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Alert a2 = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a2.getText());
		Thread.sleep(2000);
		a2.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Alert a3 = driver.switchTo().alert();	
		System.out.println("Alert Message : "+a3.getText());
		a3.sendKeys("Jay");
		Thread.sleep(2000);
		a2.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Modal Dialogs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("showSmallModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("showLargeModal")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(2000);*/
		
		//WidgetsInteractions option click option Click
		/*driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Accordian']")).click();
		Thread.sleep(2000);
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.id("section"+i+"Heading")).click();
			Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//span[text()='Progress Bar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Stop']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Tabs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("demo-tab-origin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("demo-tab-use")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("demo-tab-what")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Tool Tips']")).click();
		Thread.sleep(2000);
		WebElement hoverto = driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		Action a=actions.moveToElement(hoverto).build();
		a.perform();
		Thread.sleep(2000);
		WebElement contra = driver.findElement(By.xpath("//a[text()='Contrary']"));
		Thread.sleep(2000);
		Actions actions1=new Actions(driver);
		Action a1=actions1.moveToElement(contra).build();
		a1.perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Menu']")).click();
		Thread.sleep(2000);
		WebElement main2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Thread.sleep(2000);
		Actions actions2=new Actions(driver);
		Action a2=actions2.moveToElement(main2).build();
		a2.perform();
		Thread.sleep(2000);
		
		WebElement main2sub = driver.findElement(By.xpath("//a[text()='Sub Item']"));
		Thread.sleep(2000);
		Actions actions3=new Actions(driver);
		Action a3=actions3.moveToElement(main2sub).build();
		a3.perform();
		Thread.sleep(2000);
		
		WebElement main2subsub = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		Thread.sleep(2000);
		Actions actions4=new Actions(driver);
		Action a4=actions4.moveToElement(main2subsub).build();
		a4.perform();
		Thread.sleep(2000);
		
		WebElement main2subsubitem = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		Thread.sleep(2000);
		Actions actions5=new Actions(driver);
		Action a5=actions5.moveToElement(main2subsubitem).build();
		a5.perform();
		Thread.sleep(2000);*/
		
		//Interactions option click
		driver.findElement(By.xpath("//h5[text()='Interactions']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sortable']")).click();
		Thread.sleep(2000);
		WebElement onepos = driver.findElement(By.xpath("//div[text()='One']"));
		WebElement sixpos = driver.findElement(By.xpath("//div[text()='Six']"));
		Actions a6 = new Actions(driver);
		a6.dragAndDrop(sixpos, onepos).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Grid']")).click();
		Thread.sleep(2000);
		WebElement onebox = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
		WebElement sixbox = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]"));
		Actions a7 = new Actions(driver);
		a7.dragAndDrop(sixbox, onebox).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Selectable']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Grid']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Three']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Three']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Resizable']")).click();
		Thread.sleep(2000);
		WebElement corner = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
		Thread.sleep(2000);
		Actions a8 = new Actions(driver);
		a8.dragAndDropBy(corner, 50, 50).build().perform();
		Thread.sleep(2000);
		a8.dragAndDropBy(corner, -100, -100).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Droppable']")).click();
		Thread.sleep(2000);
		WebElement drag_me = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop_here = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions a9 = new Actions(driver);
		a9.dragAndDrop(drag_me, drop_here).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		Thread.sleep(2000);
		WebElement acceptable = driver.findElement(By.xpath("//*[@id=\"acceptable\"]"));
		WebElement not_acceptable = driver.findElement(By.xpath("//*[@id=\"notAcceptable\"]"));
		WebElement drop_here_accept = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]"));
		Actions a10 = new Actions(driver);
		a10.dragAndDrop(acceptable, drop_here_accept).build().perform();
		Thread.sleep(2000);
		a10.dragAndDrop(not_acceptable, drop_here_accept).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Prevent Propogation']")).click();
		Thread.sleep(2000);
		WebElement drag_me_prevent = driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));
		WebElement drop_here_inner_not_greedy = driver.findElement(By.xpath("//p[text()='Inner droppable (not greedy)']"));
		Actions a11 = new Actions(driver);
		a11.dragAndDrop(drag_me_prevent, drop_here_inner_not_greedy).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Revert Draggable']")).click();
		Thread.sleep(2000);
		WebElement will_revert = driver.findElement(By.xpath("//*[@id=\"revertable\"]"));
		WebElement not_revert = driver.findElement(By.xpath("//*[@id=\"notRevertable\"]"));		
		WebElement drop_here_revert = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div[2]"));
		Actions a12 = new Actions(driver);
		a12.dragAndDrop(will_revert, drop_here_revert).build().perform();
		Thread.sleep(2000);
		a12.dragAndDrop(not_revert, drop_here_revert).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dragabble']")).click();
		Thread.sleep(2000);
		WebElement simple_drag_me = driver.findElement(By.xpath("//*[@id=\"dragBox\"]"));
		Thread.sleep(2000);
		Actions a13 = new Actions(driver);
		a13.dragAndDropBy(simple_drag_me, 50, 50).build().perform();
		driver.findElement(By.xpath("//a[text()='Axis Restricted']")).click();
		Thread.sleep(2000);
		WebElement x_drag_me = driver.findElement(By.xpath("//*[@id=\"restrictedX\"]"));
		WebElement y_drag_me = driver.findElement(By.xpath("//*[@id=\"restrictedY\"]"));
		Thread.sleep(2000);
		Actions a14 = new Actions(driver);
		a14.dragAndDropBy(x_drag_me, 50, 0).build().perform();
		Thread.sleep(2000);
		a14.dragAndDropBy(y_drag_me, 0, 100).build().perform();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.quit();
	}
}

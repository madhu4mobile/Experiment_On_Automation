package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/menu/");
		
		driver.findElement(By.id("ui-id-2")).click();  /// select the tab with Menus and Submenu
		//driver.switchTo().frame(0);
		//Need to switch to the frame inside to hover the mouse
		//driver.switchTo().frame(driver.findElement(By.id("tabs-2")));
		
		Actions action = new Actions(driver);
		// the actions object is imported from selenium. And we have to pass WebDriver driver ref variable
		WebElement Home_element =  driver.findElement(By.xpath("//div[@id='tabs-2']//a[text()='Home']"));
		//WebElement Home_element = driver.findElement(By.xpath("//*[@id=\'navigate\']/ul/li[1]/a"));  // did not work with copied xpath
		//WebElement Home_element = driver.findElement(By.linkText("Home"));
		
		action.moveToElement(Home_element).build().perform();		
		WebElement subMenu_item3 = driver.findElement(By.xpath("//div[@id='tabs-2']//a[text()='Home']//following-sibling::ul//a[text()='Sub Menu Item 2']"));
		action.moveToElement(subMenu_item3).build().perform();
		
		//waiting for Home button and submenu
		
	}

}

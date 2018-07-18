package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php"); // URL
		
//		System.setProperty("webdriver.gecko.driver", "C:\\selDrivers\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver(); 
//
//		driver.get("http://automationpractice.com/index.php");

		// Use explicit wait times for the following elements
		//1. for all elements to load
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // This method is a dynamic method which waits for all the elements to load. 
		// The above is not preferred because, we dont need all the elements in major of the times.
			//System.out.println(driver.getTitle());// Print the title of the page
		
		//2. for the shopNow button on the rotating frame
		driver.manage().window().maximize();  // to maximize the window

		//clickOn(driver, shopNowButton,20);
		
		
		
		
		
		
		
		public static void clickOn(WebDriver driver, WebElement element, int timeout) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		
		public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		}
		
		public static void clickOn(WebDriver driver, WebElement element, int timeout) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		
		
		
		
		Thread.sleep(3000);
		
		//driver.quit();
		
	}

}

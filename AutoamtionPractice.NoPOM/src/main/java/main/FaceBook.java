package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com"); // URL
		
		// create elements and use that elements with explicit wait times
		//WebElement 

	}

}

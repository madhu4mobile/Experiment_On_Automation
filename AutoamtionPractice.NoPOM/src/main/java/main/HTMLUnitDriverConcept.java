package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		//headless browser
		// no browser
		// testing is happening wihtout opening the browser
		//very fast
		//WebDriver driver = new HtmlUnitDriver();   // with htmlunitDriver
		
		// for chrome headless browser...
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		// another is called phantomJS.
		//cypress -- does not use synchronization
		//cypress does not use Java.
		

	}

}

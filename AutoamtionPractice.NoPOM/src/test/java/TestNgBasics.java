import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("Browser SetUp Method");
		System.setProperty("webdriver.chrome.driver", "C://selDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		
	}
	
	@Test 
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is :"+title);
		Assert.assertEquals(title, "Google");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("close the browser");
		driver.quit();
	}
	@Test
	public void signUpElementLoadTest() {
		System.out.println("This is the second test");
	}
	
	
}

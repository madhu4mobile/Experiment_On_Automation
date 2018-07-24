import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics_Logo {
	
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
		driver.quit();	}
	@Test
	public void signUpElementLoadTest() {
		System.out.println("This is the second test");
	}
//	@Test(invocationCount = 5) // to execute the test for a given number of times
//	public void myTest(){
//		System.out.println("Hello");
//	}
	@Test 
	public void test4() {
		System.out.println("Test 4 method");
		Assert.assertEquals(2, 2); 
	}
	
	@Test(dependsOnMethods = {"test4"}) 
	public void test5() {
		System.out.println("Test 5 method  -- executed only when testCase 4 is passed");
	}
	
}

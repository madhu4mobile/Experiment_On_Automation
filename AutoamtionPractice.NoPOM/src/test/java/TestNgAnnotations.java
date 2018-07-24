

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite  //1.
	public void launchBrowser() {
		System.out.println("launchBrowser -- Will be executed before Suite");}
	@BeforeTest //2.
	public void connectToDB() {
		System.out.println("Connect to DB -- will be executed before  Test");}
	@BeforeClass //3. 
	public void deleteCookies() {
		System.out.println("Delete cookies -- will be executed before Class");	}
	@BeforeMethod //4. 
	public void login() {
		System.out.println("************************");
		System.out.println("Login to app  -- will be executed before every Method");	}
	@Test (priority = 2)
	public void test1_homepageTitleTest() {
		System.out.println("test1_homepageTitleTest -- It is test 1");}
	@Test 
	public void test2_homepageElementTest() {
		System.out.println("test2_homepageElementTest -- It is test 2  -- No priority given so treated as the zeroth");}
	@Test(priority = 1) 
	public void test3_homepageElementTest() {
		System.out.println("test3_homepageElementTest -- It is test 3 But given with priority 1");}
	@AfterMethod // executed after every test case
	public void closingTest() {
		System.out.println("Closing Test -- This will be executed after every test");
		System.out.println("**************");}
}

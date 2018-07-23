

import org.testng.annotations.BeforeSuite;

public class TestNgAnnotations {

	@BeforeSuite
	public void login() {
		System.out.println("Login to app -- Will be executed before each and every test case");
	}
	
	
}

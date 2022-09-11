package FacebookTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Facebook_POM.POM1_login;

public class FB_Test extends BaseClass {
	POM1_login Login1;

	@BeforeClass
	public void ForOpenTheBrowser() throws Throwable {
		initilizeBrowser();
		
		Login1= new POM1_login(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() {
		Login1.enterUN("9921471449");
		Login1.enterPASS("Akshay@1672");
		Login1.ClickLogin();
	}
	@Test
	public void Test1() throws Throwable {
		System.out.println("TC is Pass");
		Thread.sleep(15000);
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void closeBrowser() {
		//driver.close();
		System.out.println("closeBrowser");
	}
}

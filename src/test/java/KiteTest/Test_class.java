package KiteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Kite_POM.Pom3_Home;
import Kite_POM.Pom4_Logout;
import Utility.Utility_class;
import Kite_POM.Pom1_Login;
import Kite_POM.Pom2_Login;


public class Test_class extends BaseClass {
	//declare all useful members as global
	
			Pom1_Login login1;
			Pom2_Login login2;
			Pom3_Home home;
			Pom4_Logout logout;
			
		@BeforeClass
		public void openBrowser() throws Throwable {
			initilizeBrowser();
		    
		    //all objects of POM class
		    login1=new Pom1_Login(driver);
		     login2=new Pom2_Login(driver);
		     home=new Pom3_Home(driver);
		     
		}
		@BeforeMethod
		public void loginToApp() throws Throwable {
			//enter un
			 
			 login1.enterUN(Utility_class.getTD(1, 1));
			// System.out.println((Utility_class.getTD(0, 0)));
			 
			 //enter pwd
			login1.enterPWD(Utility_class.getTD(2, 1));
			
			//clck on login btn
			login1.clickLOGINBTN();
			
			//enter pin
			
			login2.enterPIN(Utility_class.getTD(3, 1));
			//click on continue btn
			login2.clickcntBtn();
		}
		@Test
		public void verifyuserID() throws Throwable {
			Thread.sleep(15000);
			Utility_class.CaptureScreenshot( driver, "Home");
			String actID = home.verifyuserID();
			 String expID=Utility_class.getTD(1, 1);
			 Reporter.log("running verify user id"+actID,true);
			Assert.assertEquals(expID,actID,"both are different tc is failed");
		}
		@AfterMethod
		public void logoutApp() {
			
			//logout.Logout();
			Reporter.log("logout the application",true);
		}
		@AfterClass
		public void closeBrowser() {
			driver.close();
			Reporter.log("close the app",true);
		}
			

}

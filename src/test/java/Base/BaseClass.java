package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Utility_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {// Setup Class
	public WebDriver driver;
	
	public void initilizeBrowser() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		driver=new ChromeDriver();
	//	driver=new FirefoxDriver();
		
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    //Open the Application
	    driver.get(Utility_class.getTD(4, 1));//Kite
	    //driver.get("https://www.facebook.com/login/");
	}

}

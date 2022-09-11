package Kite_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_Logout {
	
	//Declaration
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ID1;
	@FindBy(xpath = "//span[@class='icon icon-exit']") private WebElement Logout1;
	
	
	//Initialization
	
	public Pom4_Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	//Utilization
//	public void ID() {
//		//ID1.click();
//		
//	}
	public void Logout() {
		ID1.click();
		Logout1.click();
	}
}

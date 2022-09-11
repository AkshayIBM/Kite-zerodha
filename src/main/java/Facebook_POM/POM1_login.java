package Facebook_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_login {
	
	//declaration
	@FindBy(xpath = "//input[@id='email']") private WebElement UN;
	@FindBy(xpath = "//input[@id='pass']") private WebElement PASS;
	@FindBy(xpath = "//button[@id='loginbutton']") private WebElement Login;
	
	//Initialization
	public POM1_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void enterUN(String UN1) {
		UN.sendKeys(UN1);
	}
	public void enterPASS(String PASS1) {
		PASS.sendKeys(PASS1);
	}
	public void ClickLogin() {
		Login.click();
	}
}

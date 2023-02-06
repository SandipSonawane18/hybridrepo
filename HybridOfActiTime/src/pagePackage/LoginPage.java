package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement  loginButton;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	

}

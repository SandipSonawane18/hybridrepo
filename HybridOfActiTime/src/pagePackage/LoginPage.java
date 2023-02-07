package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement  loginButton;


	//Initialization
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver,this);

	}

	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}

	//valid login method
	public void validLogin(String username, String password) throws InterruptedException {
		usnTB.sendKeys(username);
		passTB.sendKeys(password);
		loginButton.click();
		Thread.sleep(3000);

	}
	//invalidLogin
	public void invalidLogin(String username, String password) throws InterruptedException {
		usnTB.sendKeys(username);
		passTB.sendKeys(password);
		loginButton.click();
		Thread.sleep(3000);
		usnTB.clear();

	}

}

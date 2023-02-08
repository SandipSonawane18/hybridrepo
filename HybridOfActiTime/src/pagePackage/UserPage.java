package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath ="//div[text()='Users']/following-sibling::img") private WebElement userTab;
	@FindBy(xpath="//input[@value=\"Create New User\"]") private WebElement createusrBT;
	@FindBy(xpath="//input[@name=\"username\"]")private WebElement usernameTB;
	@FindBy(xpath="//input[@name=\"passwordText\"]")private WebElement passTB;
	@FindBy(xpath="//input[@name=\"passwordTextRetype\"]")private WebElement repassTB;
	@FindBy(xpath = "//input[@name=\"firstName\"]")private WebElement firstNameTB;
	@FindBy(xpath = "//input[@name=\"lastName\"]")private WebElement lastNameTB;
	@FindBy(xpath = "//input[@value=\"   Create User   \"]")private WebElement crtUsrBT;
	@FindBy(xpath = "(//td[@class='listtblcell']/descendant::a)[1]")private WebElement clickOnCratedUser;
	@FindBy(xpath = "//input[@value='Delete This User']")private WebElement deletUserButton;
	
	//initialization
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	
	//utilization
	public WebElement getUserTab() {
		return userTab;
	}

	public WebElement getCreateusrBT() {
		return createusrBT;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getRepassTB() {
		return repassTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCrtUsrBT() {
		return crtUsrBT;
	}
	
	public WebElement getClickOnCratedUser() {
		return clickOnCratedUser;
	}
	public WebElement getDeletUserButton() {
		return deletUserButton;
	}
	
	//operational
	public void clickOnUserTab()
	{
		userTab.click();
	}
	
	
	public void clickOnCreateNewUser() {
		createusrBT.click();
	}
	
	public void CreateUser(String username, String password,String repassword,String firstName, String lastName) throws InterruptedException
	{
		usernameTB.sendKeys(username);
		passTB.sendKeys(password);
		repassTB.sendKeys(repassword);
		firstNameTB.sendKeys(firstName);
		lastNameTB.sendKeys(lastName);
		Thread.sleep(2000);
		crtUsrBT.click();	
	}
	public void deleteUser() {
		clickOnCratedUser.click();
		deletUserButton.click();
		
	}
	

}

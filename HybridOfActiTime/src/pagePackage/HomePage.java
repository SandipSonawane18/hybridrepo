package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="//div[.='Users']")private WebElement UserTab;
	@FindBy(xpath = "//div[.='Work Schedule']")private WebElement WorkScheduleTab;
	@FindBy(xpath = "//a[@class='username']")private WebElement AdministrativeSysTab;
	@FindBy(xpath = "//a[@class='logout']")private WebElement LogOutTab;
	@FindBy(xpath = "//a[.='Create new tasks']")private WebElement CreateNewTask;
	@FindBy(id = "SubmitTTButton")private WebElement saveLeaveTime;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	 
	}

	//Decalation
	public WebElement getUserTab() {
		return UserTab;
	}

	public WebElement getWorkScheduleTab() {
		return WorkScheduleTab;
	}

	public WebElement getAdministrativeSysTab() {
		return AdministrativeSysTab;
	}

	public WebElement getLogOutTab() {
		return LogOutTab;
	}

	public WebElement getCreateNewTask() {
		return CreateNewTask;
	}

	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	
	//operational method
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		LogOutTab.click();
	}
	
	
	
	
	
	
	
	
	
}

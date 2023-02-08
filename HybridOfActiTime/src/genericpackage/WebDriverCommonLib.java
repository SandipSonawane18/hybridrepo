package genericpackage;

import org.openqa.selenium.Alert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	
	public void getPageTitle(String pageName)
	{
		String titleOfPage = driver.getTitle();
		Reporter.log("The title Of Page"+pageName+" is "+titleOfPage);
	}

	 public void acceptAlert()
	 {
		 Alert al = driver.switchTo().alert();
		 al.accept();
	 }
}

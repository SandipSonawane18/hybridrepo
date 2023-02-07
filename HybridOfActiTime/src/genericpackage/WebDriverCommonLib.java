package genericpackage;

import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	
	public void getPageTitle(String pageName)
	{
		String titleOfPage = driver.getTitle();
		Reporter.log("The title Of Page"+pageName+" is "+titleOfPage);
	}

}

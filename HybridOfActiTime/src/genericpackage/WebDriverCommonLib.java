package genericpackage;

import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	
	public void getPageTitle()
	{
		String titleOfPage = driver.getTitle();
		Reporter.log("The title Of Page"+pageName+" is "+titleOfPage);
	}

}

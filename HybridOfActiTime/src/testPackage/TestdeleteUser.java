package testPackage;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import genericpackage.WebDriverCommonLib;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class TestdeleteUser extends BaseTest {
	@Test
	public void testUserCreate() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		UserPage up = new UserPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertydata(Prop_Path, "username"), flib.readPropertydata(Prop_Path, "password"));
		Thread.sleep(3000);
		up.clickOnUserTab();
		up.clickOnCreateNewUser();
		up.CreateUser(flib.readExcelData(Excel_Path, "createUserDetails", 1, 0), flib.readExcelData(Excel_Path, "createUserDetails", 1, 1), flib.readExcelData(Excel_Path, "createUserDetails", 1, 1), flib.readExcelData(Excel_Path, "createUserDetails", 1, 2), flib.readExcelData(Excel_Path, "createUserDetails", 1, 3));
		Thread.sleep(3000);
		up.deleteUser();
		Thread.sleep(3000);
	   WebDriverCommonLib wb = new WebDriverCommonLib();
	   wb.acceptAlert();
	}

}

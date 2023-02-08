package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import pagePackage.LoginPage;
import pagePackage.UserPage;

public class TestCreateUser extends BaseTest {

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
	}

}

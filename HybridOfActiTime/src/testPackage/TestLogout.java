package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

public class TestLogout extends BaseTest {
	
	@Test
	public void testLogoutTab () throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		HomePage hp = new HomePage(driver);
		lp.validLogin(flib.readPropertydata(Prop_Path, "username"), flib.readPropertydata(Prop_Path, "password"));
		hp.logout();
	}

}

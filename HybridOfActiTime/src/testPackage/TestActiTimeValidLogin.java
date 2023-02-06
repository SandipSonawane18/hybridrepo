package testPackage;

import java.io.IOException;

import org.junit.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import pagePackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {
	@Test
	public void testValidLogin () throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertydata(Prop_Path, "username"), flib.readPropertydata(Prop_Path, "password"));
	}
	

}
package DataDriven;
import java.io.IOException;

import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import pagePackage.LoginPage;

public class TestActiTimeValidLogin1 extends BaseTest {
	@Test
	public void testValidLogin () throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertydata(Prop_Path, "username"), flib.readPropertydata(Prop_Path, "password"));
	}
	

}

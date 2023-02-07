package testPackage;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericpackage.BaseTest;
import genericpackage.Flib;
import pagePackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {
	@Test
public void invalidLogin() throws EncryptedDocumentException, InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.rowcount(Excel_Path, "invalidInput");
		for(int i=0;i<=rc;i++)
		{
			lp.invalidLogin(flib.readExcelData(Excel_Path, "invalidInput", i, 0), flib.readExcelData(Excel_Path,"invalidInput", i, 1));
		}
		
	}

}

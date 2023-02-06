package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=3p8hxlpownuu7");
		Flib flib = new Flib();
		int rc = flib.rowcount("./data/ActiTimeTestData.xlsx", "invalidInput");
		for (int i=0;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidInput", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidInput", i, 1);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).clear();

		}
		driver.close();
	}

}

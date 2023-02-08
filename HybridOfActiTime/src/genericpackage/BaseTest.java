package genericpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant {

	protected static WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException{

		Flib flib = new Flib();
		String browserValue = flib.readPropertydata(Prop_Path, "browser");
		String url = flib.readPropertydata(Prop_Path, "url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Chrome_key, Chrome_Value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else if (browserValue.equalsIgnoreCase("firefox")) 

		{
			System.setProperty(FireFox_key, FireFox_Value);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);	
		}
		else {
			Reporter.log("invalid browser",true);
		}
	}

	public void failed(String methodname) {
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(ScreenShot_Path+methodname+".png");
			Files.copy(src, dest);	
		}
		catch(Exception e)
		{

		}
	}
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}	
}




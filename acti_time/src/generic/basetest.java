package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest implements autoconast {
	public static WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty(gecko_key,gecko_value);
		driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
	}
	@AfterMethod
	public void closeapplication()
	{
		driver.close();
	}

}

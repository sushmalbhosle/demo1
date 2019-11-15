package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class basepage {
	public static WebDriver driver;
	public basepage(WebDriver driver)
	{
		basepage.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public  void verifytitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching",true);	
		}
		catch(Exception e)
		{
		
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
		public void verifyelement(WebElement ele)
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			try
			{
				w.until(ExpectedConditions.visibilityOf(ele));
				Reporter.log("element is present",true);
			}
			catch(Exception e)
			{
				Reporter.log("element is not present",true);
				Assert.fail();
				
			}
		}
		
	}



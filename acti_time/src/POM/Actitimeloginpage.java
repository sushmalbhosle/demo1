package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.basepage;

public class Actitimeloginpage extends basepage {
	
	//declaration
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginbutton;
	@FindBy(xpath = "//span[contains(.,'invalid')]" )
	private WebElement errormsg;
	public Object logout;
	
	//intializatiion
	public Actitimeloginpage(WebDriver driver) {
		super(driver);
		
	}
	//utilization
	public void username(String un)
	{
		username.sendKeys(un);
	}
	public void Password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	public void verifyerror()
	{
		verifyelement(errormsg);
	}
	public void verifylogin_title(String title)
	{
		verifylogin_title(title);
	}
	public void verifyhp_title(String hometitle) {
		// TODO Auto-generated method stub
		
	}
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	public void loginbtn() {
		// TODO Auto-generated method stub
		
	}
	public void passward(String pwd) {
		// TODO Auto-generated method stub
		
	}

}

package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name ="uid")
	WebElement txtusername;
	
	@FindBy(name ="password")
	WebElement txtpassword;
	
	@FindBy(name ="btnLogin")
	WebElement btnlogin;
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickSumbit()
	{
		btnlogin.click();
	}
}


//json enterpritors
//
package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.loginpage;

public class Tc_logintest extends Baseclass {
	@Test
	public void logintest() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(3000);
		loginpage lp= new loginpage(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		
		lp.clickSumbit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

}

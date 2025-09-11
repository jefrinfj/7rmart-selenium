package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;



public class Logintest extends Base {
	@Test
	public void verifyUserCanLoginWithCorrectUsernameAndPassword() throws IOException
	{
		//String user= "admin";
		//String pass ="admin";
		String user=ExcelUtility.getstringData(1,0,"loginpage");
		String pass=ExcelUtility.getstringData(1,1,"loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusername(user);
		loginpage.enterpassword(pass);
		loginpage.clickloginbutton();
		boolean ishomepageloaded=loginpage.isdashboardDisplayed();
		Assert.assertTrue(ishomepageloaded);
		
	}
	@Test
	public void verifyUserCanLoginWithCorrectUsernameAndInvalidPassword() throws IOException
	{
		String user=ExcelUtility.getstringData(2,0,"LoginPage");
		String pass=ExcelUtility.getstringData(2,1,"LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterusername(user);
		loginpage.enterpassword(pass);
		loginpage.clickloginbutton();
		boolean ishomepageloaded=loginpage.isalertDisplayed();
		Assert.assertTrue(ishomepageloaded);

	}

@Test
public void verifyUserCanLoginWithInvalidUsernameCorrectPassword() throws IOException
{
	String user=ExcelUtility.getstringData(3,0,"LoginPage");
	String pass=ExcelUtility.getstringData(3,1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterusername(user);
	loginpage.enterpassword(pass);
	loginpage.clickloginbutton();
	boolean ishomepageloaded=loginpage.isalertDisplayed();
	Assert.assertTrue(ishomepageloaded);
}
@Test
public void verifyUserCanLoginWithInvalidUsernameAndInvalidPassword() throws IOException
{
	String user=ExcelUtility.getstringData(4,0,"LoginPage");
	String pass=ExcelUtility.getstringData(4,1,"LoginPage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterusername(user);
	loginpage.enterpassword(pass);
	loginpage.clickloginbutton();
	boolean ishomepageloaded=loginpage.isalertDisplayed();
	Assert.assertTrue(ishomepageloaded);
}
}

	

package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

import pages.ManageFooterTextPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageFooterTextTest extends Base {
	
	
	
	@Test(priority = 1)
	public void editFooterText() throws IOException
	{
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(loginUserName);
		loginPage.enterpassword(loginPassword);
		loginPage.sigin();

		
		ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);

		FakerUtility fakerUtility = new FakerUtility();
		String address = fakerUtility.generateAddress();
		String email = fakerUtility.generateEmail();	
		String phone = "7540081473";
		managefootertextpage.ClickManageFooterTextMoreInfo();
		managefootertextpage.clickEditIcon();
		managefootertextpage.enterAddress(loginPassword);
		managefootertextpage.enterEmail(email);
		managefootertextpage.enterPhone(phone);
		managefootertextpage.clickUpdateButton();
		
		Assert.assertTrue(managefootertextpage.isSuccessAlertDisplayed(), "Success Alert is not displayed");
		
		
	/*	LogoutPage logoutpage = new LogoutPage(driver);
		managefootertextpage = logoutpage.ClickManageFooterTextMoreInfo();
		
		
		FakerUtility fakerUtility = n;ew FakerUtility();
		String address = fakerUtility.generateAddress();
		String email = fakerUtility.generateEmail();	
		String phone = fakerUtility.generatePhoneNumber();
		
		managefootertextpage.clickEditIcon().enterAddress(address).enterEmail(email).enterPhone(phone).clickUpdateButton();
	
		Assert.assertTrue(managefootertextpage.isSuccessAlertDisplayed(), "Success Alert is not displayed");*/
	}

}
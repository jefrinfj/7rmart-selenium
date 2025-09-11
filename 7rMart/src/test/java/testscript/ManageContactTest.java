package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageContactTest extends Base {
	

	
	@Test(priority = 1)
	public void updateContactInfo() throws IOException 
	{
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(loginUserName);
		loginPage.enterpassword(loginPassword);
		loginPage.sigin();
		
		FakerUtility fakerUtility = new FakerUtility();
		String phoneNumber = "9995554444";
		String address = fakerUtility.generateAddress();
		String time =  "10";
		int chargeLimit = 300;
		String email="six";
		
		ManageContactPage managecontactpage =new  ManageContactPage(driver);
		managecontactpage.clickManageContactMoreInfo();
		managecontactpage.clickContactEditIcon();
		managecontactpage.updatePhoneNumber(phoneNumber);
		managecontactpage.updateEmail(email);
		managecontactpage.updateAddress(address);
		managecontactpage.updateDeliveryChargeLimit(chargeLimit);
		managecontactpage.clickUpdateContactInfoButton();
		Assert.assertTrue(managecontactpage.isSuccessAlertDisplayed(), "Success Alert is not displayed");
		
		
		
	/*	managecontactpage = new ManageContactPage(driver);
		managecontactpage.clickContactEditIcon()
							.updatePhoneNumber(phoneNumber)
							.updateEmail(email)
							.updateAddress(address)
							.updateDeliveryTime(time)
							.updateDeliveryChargeLimit(chargeLimit)
							.clickUpdateContactInfoButton();
		
		Assert.assertTrue(managecontactpage.isSuccessAlertDisplayed(), "Success Alert is not displayed");*/
	}

}// End of class
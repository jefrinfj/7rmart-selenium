package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	LogoutPage logoutpage;
	@Test(priority = 1)
	public void logoutFromLoginPageTest() throws IOException {
		String username = ExcelUtility.getstringData(1, 0, "LoginPage");
		String password = ExcelUtility.getstringData(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username).enterPassword(password);
		logoutpage=loginPage.sigin();
		//loginPage.enterPassword(password);
		//loginPage.sigin();

		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickProfileIcon();
		logoutpage.clickLogoutButton();
		Assert.assertTrue(logoutpage.isLoginPageDisplayed(), Constant.LOGINPAGENOTLOADEDMESSAGE);
	}

}
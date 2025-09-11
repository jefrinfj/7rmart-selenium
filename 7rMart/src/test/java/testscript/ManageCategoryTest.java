package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;


public class ManageCategoryTest extends Base {
	
	
	ManageCategoryPage managecategorypage;
	
	@Test(priority = 1)
	public void editImage() throws IOException 
		{
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(loginUserName);
		loginPage.enterpassword(loginPassword);
		//loginPage.enterPassword(loginPassword);
	  loginPage.sigin();
		
	  	ManageCategoryPage manageCategorie =new ManageCategoryPage(driver);
		manageCategorie.clickManageCategoryMoreInfo();
		manageCategorie.clickEditIcon();
		manageCategorie.clickChooseFileButton().clickUpdateButton();
		//managecategorypage.clickChooseFileButton();
		//managecategorypage.clickUpdateButton();
		Assert.assertTrue(managecategorypage.isSuccessAlertDisplayed(), "Success Alert is not displayed");
		}
	
	@Test(priority = 2)
	public void addNewCategory() throws IOException
		{
		String loginUserName = ExcelUtility.getstringData(1,0, "LoginPage"); 
		String loginPassword = ExcelUtility.getstringData(1,1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(loginUserName);
		loginPage.enterpassword(loginPassword);
		//loginPage.enterUsername(loginUserName);
		//loginPage.enterPassword(loginPassword);
		loginPage.sigin();

		
	
	

		
	
		/*
		manageCategorie.clickchooseFile();
		manageCategorie.ClickSaveButton(); manageCategorie =new ManageCategoriePage(driver);
		manageCategorie.clickmanagCategorie();
		manageCategorie.clicknewCategorie();
		manageCategorie.enterCategories();
		manageCategorie.clickchooseFile();
		manageCategorie.ClickSaveButton(); manageCategorie =new ManageCategoriePage(driver);
		manageCategorie.clickmanagCategorie();
		manageCategorie.clicknewCategorie();
		manageCategorie.enterCategories();
		manageCategorie.clickchooseFile();
		manageCategorie.ClickSaveButton();*/
		}

}
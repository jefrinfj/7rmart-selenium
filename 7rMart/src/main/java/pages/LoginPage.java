package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@placeholder='Username' and @name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password' and @name='password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement loginButton;
	@FindBy(xpath = "//button[text( )='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement display;
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String loginusername) {

		username.sendKeys(loginusername);
	}

	public void enterpassword(String loginPassword) {
		password.sendKeys(loginPassword);
	}

	public void clickloginbutton() {
		signinbutton.click();
	}

	public void sigin() {
		loginButton.click();
	}

	public boolean isdashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	public boolean isalertDisplayed() {
		return display.isDisplayed();
		
	}
}

package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExecutionUtility {
	
	public void javaScriptClick(WebDriver driver, WebElement webElementName)
		{
	 			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", webElementName); //arguments[0].click() represent the script to click the button element
		}
	
	
	public void javaScriptSendText(WebDriver driver, WebElement webElementName)
		{
 			
		JavascriptExecutor js = (JavascriptExecutor) driver; //typecast the driver to JavascriptExecutor
		js.executeScript("arguments[0].value='Hello';", webElementName);
		}
	
	public void javaScriptScrollToBottom(WebDriver driver, WebElement webElementName)
	{
			
	JavascriptExecutor js = (JavascriptExecutor) driver; //typecast the driver to JavascriptExecutor
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	
	
}
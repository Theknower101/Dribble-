package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

WebDriver driver;
@FindBy(name="login")
WebElement emailField;
@FindBy(xpath="//form[@action='/session/send_email_otp']//button[@type='submit'][normalize-space()='Continue']")
WebElement continueButton;

public LoginPage(WebDriver theDriver) {
	this.driver=theDriver;
	PageFactory.initElements(theDriver,this);
}
public void loginProcess(String email) {
	driver.navigate().to("https://dribbble.com/session/new");
	fillEmail( email);
	confirmLogin();
}
private void fillEmail(String email) {
	emailField.sendKeys(email);
}
private void confirmLogin() {
	continueButton.click();
}
}

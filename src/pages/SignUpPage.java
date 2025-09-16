package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage {
WebDriver driver;
@FindBy(css=".site-nav__signup.site-nav-hide-mobile")
WebElement signUpButton;
@FindBy(className="auth-screen-header__heading")
 WebElement signUpTitle;
@FindBy(name="email")
WebElement emailInput;
@FindBy(css="body > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > button:nth-child(3)")
WebElement submitButton;

public SignUpPage(WebDriver theDriver) {
	this.driver=theDriver;
	PageFactory.initElements(theDriver, this);
}
public void signUpTest(String email) {
	signUpButton.click();
	Assert.assertEquals(checkSignUpPage(), true);
	emailInput.sendKeys(email);
	submitButton.click();
}
public boolean checkSignUpPage() {
	return signUpTitle.isDisplayed();
}
}

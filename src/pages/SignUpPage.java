package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignUpPage {
WebDriver driver;
//Locator
By signUpButtonLocator=By.cssSelector(".site-nav__signup.site-nav-hide-mobile");
By signUpTitleLocator=By.className("auth-screen-header__heading");
By emailInputLocator=By.name("email");
By submitButtonLocator=By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(4) > button:nth-child(3)");
public SignUpPage(WebDriver theDriver) {
	this.driver=theDriver;
}
public void signUpTest(String email) throws InterruptedException {
	driver.findElement(signUpButtonLocator).click();
	Thread.sleep(1000);
	Assert.assertEquals(checkSignUpPage(), true);
	driver.findElement(emailInputLocator).sendKeys(email);
	driver.findElement(submitButtonLocator).click();
}
public boolean checkSignUpPage() {
	WebElement signUpTitle=driver.findElement(signUpTitleLocator);
	return signUpTitle.isDisplayed();
}
}

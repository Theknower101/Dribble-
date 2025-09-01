package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

WebDriver driver;
//Locator
By emailLocator=By.name("login");
By countinueButtonLocator=By.xpath("//form[@action='/session/send_email_otp']//button[@type='submit'][normalize-space()='Continue']");
By loginTitleLocator=By.xpath("//h1[normalize-space()='Welcome back']");
public LoginPage(WebDriver theDriver) {
	this.driver=theDriver;
}
public void logInTest() throws InterruptedException {
	driver.navigate().to("https://dribbble.com/session/new");
	Thread.sleep(1000);
	Assert.assertEquals(checkLoginPage(), true);
	driver.findElement(emailLocator).sendKeys("at3220920@gmail.com");
	driver.findElement(countinueButtonLocator).click();
}
public boolean checkLoginPage() {
	WebElement loginTitle=driver.findElement(loginTitleLocator);
	return loginTitle.isDisplayed();
}
}

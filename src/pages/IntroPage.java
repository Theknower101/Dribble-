package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntroPage {
    WebDriver driver;
  //Locators
    @FindBy(className="home-hero__heading")
    WebElement titleOfPage;
  	@FindBy(xpath="//input[@id='autocomplete-1-input']")
  	WebElement designTypeField;
  	@FindBy(partialLinkText="Discover")
  	WebElement discoverTab;
    @FindBy(partialLinkText="Explore")
    WebElement exploreTab;
  
	public IntroPage(WebDriver theDriver) {
		this.driver=theDriver;
		PageFactory.initElements(theDriver, this);
	}
	
	public boolean checkTheIntroPageIsDisplayed() {
		return titleOfPage.isDisplayed()&&designTypeField.isDisplayed()&&discoverTab.isDisplayed()&&exploreTab.isDisplayed();
	}
}

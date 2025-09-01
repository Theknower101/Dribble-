package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntroPage {
    WebDriver driver;
  //Locators
  	By titleOfPageLocator=By.className("home-hero__heading");
  	By designTypeFieldLocator=By.xpath("//input[@id='autocomplete-1-input']");
  	By discoverTabLocator=By.partialLinkText("Discover");
  	By exploreTabLocator=By.partialLinkText("Explore");
	public IntroPage(WebDriver theDriver) {
		this.driver=theDriver;
	}
	
	public boolean checkTheIntroPageIsDisplayed() {
		WebElement titleOfPage=driver.findElement(titleOfPageLocator);
		WebElement designTypeSearchField=driver.findElement(designTypeFieldLocator);
		WebElement discoverTab=driver.findElement(discoverTabLocator);
		WebElement exploreTab=driver.findElement(exploreTabLocator);
		return titleOfPage.isDisplayed()&&designTypeSearchField.isDisplayed()&&discoverTab.isDisplayed()&&exploreTab.isDisplayed();
	}
}

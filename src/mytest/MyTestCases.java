
package mytest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.IntroPage;
import pages.LoginPage;
import pages.SignUpPage;
import utils.DriverFactory;
import utils.TesData;
import utils.TestDataGenerator;
public class MyTestCases {
    WebDriver driver;
    IntroPage intro;
    SignUpPage signup;
    LoginPage login;
    String email;
    @BeforeTest
    public void mySetUp() {
        driver = DriverFactory.openDriver(); 
        intro = new IntroPage(driver);
        signup=new SignUpPage(driver);
        login=new LoginPage(driver);
    }

    @Test(priority=1)
    public void checkTheIntroPage() throws InterruptedException {
    	Thread.sleep(1000);
        Assert.assertEquals(
            intro.checkTheIntroPageIsDisplayed(),true,
            "❌ Intro page  is not displayed!"
        );
    }
    @Test(priority=2)
    public void signUp() throws InterruptedException {
    	Thread.sleep(1000);
    	email=TestDataGenerator.getRandomEmail(TesData.email);
    	signup.signUpTest(email);
    }
   @Test(priority=3)
   public void logIn () throws InterruptedException {
	   login.loginProcess("at3220920@gmail.com");
   }
    @AfterTest
    public void closeDriver() {
        DriverFactory.killDriver();
    }
}


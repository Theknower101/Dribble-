package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
private static WebDriver driver;
public static WebDriver openDriver() {
	if(driver==null) {
		driver=new ChromeDriver();
		driver.get("https://dribbble.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	return driver;
}
public static void killDriver() {
	if(driver!=null) {
		driver.quit();
		driver=null;
	}
}
}

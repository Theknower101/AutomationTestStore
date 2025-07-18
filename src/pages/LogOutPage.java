package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogOutPage {
WebDriver driver;
By logOutButtonLocator=By.linkText("Logoff");
By continueButtonLocator=By.linkText("Continue");
public LogOutPage(WebDriver theDriver) {
	this.driver=theDriver;
}
public void logOut() {
	driver.findElement(logOutButtonLocator).click();
	Assert.assertEquals(checkTheLogOutPage(), true);
	driver.findElement(continueButtonLocator).click();
	
}
public boolean checkTheLogOutPage() {
	return driver.getPageSource().contains("Account Logout");
}
}

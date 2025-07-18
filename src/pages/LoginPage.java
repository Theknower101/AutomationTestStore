package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver theDriver) {
		this.driver=theDriver;
	}

By logInLocator=By.id("loginFrm_loginname");
By passwordLocator=By.name("password");
By loginButtonLocator=By.xpath("//button[normalize-space()='Login']");
public void logIn(String logInName,String password) {
	driver.get("https://automationteststore.com/index.php?rt=account/login");
	driver.findElement(logInLocator).sendKeys(logInName);
	driver.findElement(passwordLocator).sendKeys(password);
	driver.findElement(loginButtonLocator).click();
	
}
public boolean checkTheLogInSucceed() {
	return driver.getPageSource().contains(" My Account");
}
}

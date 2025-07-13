package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Login extends TestData {

	public void logInTest() throws InterruptedException {
		driver.navigate().to(logInUrl);
		//Element
		WebElement loginNameInput=driver.findElement(By.name("loginname"));
		WebElement passwordInput=driver.findElement(By.id("loginFrm_password"));
		//Action
		Thread.sleep(2000);
		loginNameInput.sendKeys(loginName);
		passwordInput.sendKeys(passwordValue);
		
	}
public void checkTheLoginText() {
	boolean isDisplayed=driver.getPageSource().contains(logInText.toUpperCase());
	Assert.assertEquals(isDisplayed, true);
}
}

package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogOff extends TestData {

	public void logOutTest() throws InterruptedException {
		driver.get(logOutUrl);
		Thread.sleep(2000);
		verifyLogOutpage();
		clickOnContinueButton();
	}
	public void clickOnContinueButton() {
		//Element
		WebElement continueButton=driver.findElement(By.cssSelector("a[title='Continue']"));
		//Action
		continueButton.click();
	}
	public void verifyLogOutpage() {
		//Data
		boolean theExpectedLogOutText=true;
		boolean actual=driver.getPageSource().contains(logOffText);
		//Action
		Assert.assertEquals(actual, theExpectedLogOutText);
	}
}

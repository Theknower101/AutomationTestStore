package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogOff extends TestData {

	public void logOutTest() throws InterruptedException {
		WebElement logOffButton=driver.findElement(By.linkText("Logoff"));
		logOffButton.click();
		Thread.sleep(2000);
		boolean theExpected=true;
		boolean actual=driver.getPageSource().contains(logOffText);
		Assert.assertEquals(actual, theExpected);
		WebElement continueButton=driver.findElement(By.cssSelector("a[title='Continue']"));
		continueButton.click();
	}
}

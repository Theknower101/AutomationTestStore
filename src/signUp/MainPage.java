package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainPage extends TestData{
	public void navigateToSignUpPageTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to(urlLoginPage);
	}
	public void checkTheSignUpWindowTest() throws InterruptedException {
		Thread.sleep(2000);
		//Data
		String signUpWindowNameUpperCase=signUpWindowName.toUpperCase();
		String signUpWindowNameElement=driver.findElement(By.xpath("//h2[normalize-space()='I am a new customer.']")).getText();
		//Action
		Assert.assertEquals(signUpWindowNameUpperCase, signUpWindowNameElement);
	}
	public void checkTheTitleOfThePageTest() {
		//Data
		String actualTitle=driver.getTitle();
		//Action
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}

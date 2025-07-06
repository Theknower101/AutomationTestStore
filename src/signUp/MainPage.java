package signUp;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends TestData{
	public void navigateToSignUpPageTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to(urlLoginPage);
	}
	public void checkTheSignUpWindowTest() throws InterruptedException {
		Thread.sleep(2000);
		String signUpWindowNameUpperCase=signUpWindowName.toUpperCase();
		String signUpWindowNameElement=driver.findElement(By.xpath("//h2[normalize-space()='I am a new customer.']")).getText();
		Assert.assertEquals(signUpWindowNameUpperCase, signUpWindowNameElement);
	}
}

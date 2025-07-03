package login;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends TestData{
	public void navigateToLoginPageTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to(urlLoginPage);
	}
	public void checkTheLoginWindowTest() throws InterruptedException {
		Thread.sleep(2000);
		String loginWindowNameUpperCase=loginWindowName.toUpperCase();
		String loginWindowNameElement=driver.findElement(By.xpath("//h2[normalize-space()='I am a new customer.']")).getText();
		Assert.assertEquals(loginWindowNameUpperCase, loginWindowNameElement);
	}
}

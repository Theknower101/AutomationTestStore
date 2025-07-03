package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends TestData {
	public void logInTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement countinueButton=driver.findElement(By.cssSelector("button[title='Continue']"));
		countinueButton.click();
		//element
	 WebElement firstNameInput=driver.findElement(By.name("firstname"));
	 WebElement lastNameInput=driver.findElement(By.name("lastname"));
     WebElement emailInput=driver.findElement(By.id("AccountFrm_email"));
     WebElement phoneInput=driver.findElement(By.id("AccountFrm_telephone"));
       //data
	    int firstNameIndex=rand1.nextInt(firstName.length);
	    int lastNameIndex=rand2.nextInt(lastName.length);
	    int telephoneIndex=rand3.nextInt(telephone.length);
	    String email =firstName[firstNameIndex] +lastName[lastNameIndex]+"@gmail.com";
	    //Action
	    firstNameInput.sendKeys(firstName[firstNameIndex]);
	    Thread.sleep(2000);
	    lastNameInput.sendKeys(lastName[lastNameIndex]);
	    Thread.sleep(2000);
	    emailInput.sendKeys(email);
	    Thread.sleep(2000);
	    phoneInput.sendKeys(telephone[telephoneIndex]);
	}
	public void checkAddressTextTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement addressText=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > h4:nth-child(6)"));
		boolean isDisplayed=addressText.isDisplayed();
		Assert.assertEquals(isExist, isDisplayed);
	}
}

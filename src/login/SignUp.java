package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUp extends TestData {
	public void signUpTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement countinueButton=driver.findElement(By.cssSelector("button[title='Continue']"));
		countinueButton.click();
		//element
	 WebElement firstNameInput=driver.findElement(By.name("firstname"));
	 WebElement lastNameInput=driver.findElement(By.name("lastname"));
     WebElement emailInput=driver.findElement(By.id("AccountFrm_email"));
     WebElement phoneInput=driver.findElement(By.id("AccountFrm_telephone"));
     WebElement faxInput=driver.findElement(By.id("AccountFrm_fax"));
     WebElement companyInput=driver.findElement(By.id("AccountFrm_company"));
     WebElement firstAddressInput=driver.findElement(By.id("AccountFrm_address_1"));
     WebElement secondAddressInput=driver.findElement(By.id("AccountFrm_address_2"));
     WebElement cityInput=driver.findElement(By.id("AccountFrm_city"));
     WebElement selectElementState=driver.findElement(By.id("AccountFrm_zone_id"));
     WebElement selectElementCountry=driver.findElement(By.id("AccountFrm_country_id"));
     WebElement zipCodeInput=driver.findElement(By.id("AccountFrm_postcode"));
     WebElement loginNameInput=driver.findElement(By.id("AccountFrm_loginname"));
     WebElement passwordInput=driver.findElement(By.id("AccountFrm_password"));
     WebElement confimedPasswordInput=driver.findElement(By.id("AccountFrm_confirm"));
     WebElement yesRadio=driver.findElement(By.xpath("//label[@for='AccountFrm_newsletter1']"));
     WebElement policyCheckBox=driver.findElement(By.xpath("//label[@class='col-md-6 mt20 mb40']"));
     WebElement continueButton=driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
       //data
	    int firstNameIndex=rand1.nextInt(firstName.length);
	    int lastNameIndex=rand2.nextInt(lastName.length);
	    int telephoneIndex=rand3.nextInt(telephone.length);
	    int faxIndex=rand4.nextInt(fax.length);
	    int passwordIndex=rand5.nextInt(password.length);
	    String passwordValue=password[passwordIndex];
	    String confirmedPassword=password[passwordIndex];
	    String email =firstName[firstNameIndex] +lastName[lastNameIndex]+"@gmail.com";
	    Select stateSelect=new Select(selectElementState);
	    Select countrySelect=new Select(selectElementCountry);
	    //Action
	    firstNameInput.sendKeys(firstName[firstNameIndex]);
	    Thread.sleep(2000);
	    lastNameInput.sendKeys(lastName[lastNameIndex]);
	    Thread.sleep(2000);
	    emailInput.sendKeys(email);
	    Thread.sleep(2000);
	    phoneInput.sendKeys(telephone[telephoneIndex]);
	    Thread.sleep(2000);
	    faxInput.sendKeys(fax[faxIndex]);
	    Thread.sleep(2000);
	    checkAddressTextTest();
	    Thread.sleep(2000);
	    companyInput.sendKeys(company);
	    Thread.sleep(2000);
	    firstAddressInput.sendKeys(address1);
	    Thread.sleep(2000);
	    secondAddressInput.sendKeys(address2);
	    Thread.sleep(2000);
	    cityInput.sendKeys(city);
	    Thread.sleep(2000);
	    selectElementState.click();
	    stateSelect.selectByVisibleText("Angus");
	    Thread.sleep(2000);
	    zipCodeInput.sendKeys(zipCode);
	    Thread.sleep(2000);
	    selectElementCountry.click();
	    countrySelect.selectByVisibleText("Croatia");
	    Thread.sleep(2000);
	    checkLoginTextTest();
	    Thread.sleep(2000);
	    loginNameInput.sendKeys(email);
	    Thread.sleep(2000);
	    passwordInput.sendKeys(password[passwordIndex]);
	    Thread.sleep(2000);
	    confimedPasswordInput.sendKeys(confirmedPassword);
	    Thread.sleep(2000);
	    checkNewSletterText();
	    Thread.sleep(2000);
	    yesRadio.click();
	    Thread.sleep(2000);
	    policyCheckBox.click();
	    continueButton.click();
	}
	public void checkAddressTextTest() throws InterruptedException {
		Thread.sleep(2000);
		WebElement addressText=driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > h4:nth-child(6)"));
		boolean isDisplayed=addressText.isDisplayed();
		Assert.assertEquals(isExist, isDisplayed);
	}
	public void checkLoginTextTest() throws InterruptedException {
		Thread.sleep(2000);
		//Element
		WebElement loginText=driver.findElement(By.xpath("//h4[normalize-space()='Login Details']"));
		//Data
		boolean isExist=true;
		boolean isDisplayed=loginText.isDisplayed();
		//Action
		Assert.assertEquals(isExist, isDisplayed);
	}
	public void checkNewSletterText() throws InterruptedException {
		Thread.sleep(2000);
		//Element
		WebElement newSletterText=driver.findElement(By.xpath("//h4[normalize-space()='Newsletter']"));
		//Data
		boolean isExist=true;
		boolean isDisplayed=newSletterText.isDisplayed();
		//Action
		Assert.assertEquals(isExist, isDisplayed);
	}

}

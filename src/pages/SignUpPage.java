package pages;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SignUpPage {
	 WebDriver driver;
	 Random rand=new Random();
	 public SignUpPage(WebDriver theDriver) {
		this.driver=theDriver;
	 }
	By firstNameLocator=By.xpath("//input[@id='AccountFrm_firstname']");
	By lastNamesLocator=By.xpath("//input[@id='AccountFrm_lastname']");
	By emailLocator=By.xpath("//input[@id='AccountFrm_email']");
	By phoneLocator=By.xpath("//input[@id='AccountFrm_telephone']");
	By faxLocator=By.xpath("//input[@id='AccountFrm_fax']");
	By companyLocator=By.xpath("//input[@id='AccountFrm_company']");
	By firstAddressLocator=By.xpath("//input[@id='AccountFrm_address_1']");
	By secondAddressLocator=By.xpath("//input[@id='AccountFrm_address_2']");
	By cityLocator=By.xpath("//input[@id='AccountFrm_city']");
	By zipCodeLocator=By.xpath("//input[@id='AccountFrm_postcode']");
	By countryLocator=By.xpath("//select[@id='AccountFrm_country_id']");
	By stateLocator=By.xpath("//select[@id='AccountFrm_zone_id']");
	By loginNameLocator=By.xpath("//input[@id='AccountFrm_loginname']");
	By paswwordLocator=By.xpath("//input[@id='AccountFrm_password']");
	By confirmedPasswordLocator=By.xpath("//input[@id='AccountFrm_confirm']");
	By yesLocator=By.xpath("//input[@id='AccountFrm_newsletter1']");
	By privacyPolicyLocator=By.xpath("//input[@id='AccountFrm_agree']");
	By firstContinueButton=By.xpath("//button[normalize-space()='Continue']");
public  void fillData(String signUpFirstName,String signUpLastName,String signUpEmail,String signUpPhoneNumber,String signUpFax,String loginName,String password) throws InterruptedException {
	driver.findElement(firstNameLocator).sendKeys(signUpFirstName);
	driver.findElement(lastNamesLocator).sendKeys(signUpLastName);
	driver.findElement(emailLocator).sendKeys(signUpEmail );
	driver.findElement(phoneLocator).sendKeys(signUpPhoneNumber);
	driver.findElement(faxLocator).sendKeys(signUpFax);
	driver.findElement(companyLocator).sendKeys("Microsoft");
	driver.findElement(firstAddressLocator).sendKeys("Amman");
	driver.findElement(secondAddressLocator).sendKeys("Arajan");
	driver.findElement(cityLocator).sendKeys("Amman");
	driver.findElement(zipCodeLocator).sendKeys("9900");
	Select countrySelect=new Select(driver.findElement(countryLocator));
	int countryCount=driver.findElement(countryLocator).findElements(By.tagName("option")).size();
	driver.findElement(countryLocator).click();
	countrySelect.selectByIndex(rand.nextInt(1,countryCount));
	Thread.sleep(1000);
	Select stateSelect=new Select(driver.findElement(stateLocator));
	int stateCount=driver.findElement(stateLocator).findElements(By.tagName("option")).size();
	driver.findElement(stateLocator).click();
	stateSelect.selectByIndex(rand.nextInt(1,stateCount));
	driver.findElement(loginNameLocator).sendKeys(loginName);
	driver.findElement(paswwordLocator).sendKeys(password);
	driver.findElement(confirmedPasswordLocator).sendKeys(password);
	driver.findElement(yesLocator).click();
	driver.findElement(privacyPolicyLocator).click();	
	driver.findElement(firstContinueButton).click();
	Thread.sleep(2000);
}
public boolean checkSignUpPage() {
	return driver.getPageSource().contains("Create Account");
}
public boolean checkTheAccountCreated() {
	return driver.getPageSource().contains("Your Account Has Been Created!");
}
}

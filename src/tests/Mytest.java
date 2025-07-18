package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.SignUpPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
public class Mytest {
WebDriver driver;
String url="https://automationteststore.com/index.php?rt=account/create";
SignUpPage sign;
LoginPage login;
LogOutPage out;
CartPage cart;
String loginName;
String password;
@BeforeTest
public void setUp() {
	driver=DriverFactory.getDriver();
	driver.get(url);
   sign=new SignUpPage(driver);
   login = new LoginPage(driver);
   out=new LogOutPage(driver);
   cart=new CartPage(driver);
}
@Test(priority=1)
public void signUp() throws InterruptedException {
Assert.assertEquals(sign.checkSignUpPage(), true);
String firstName=TestDataGenerator.getFirstNameRandomly();
String lastName=TestDataGenerator.getLastNameRandomly();
String email=TestDataGenerator.getEmailRandomly(firstName, lastName);
String phone=TestDataGenerator.getPhoneNumberRnadomly();
String fax=TestDataGenerator.getFaxRnadomly();
 loginName=TestDataGenerator.getLoginNameRandomly(firstName, lastName);
 password=TestDataGenerator.getPasswordRandomly();
sign.fillData(firstName, lastName, email, phone, fax,loginName,password);
Assert.assertEquals(sign.checkTheAccountCreated(), true);

}
@Test(priority=2)
public void logOut() throws InterruptedException {
	Thread.sleep(2000);
	out.logOut();
}
@Test(priority=3)
public void logIn() throws InterruptedException {
	
	login.logIn(loginName, password);
	Thread.sleep(1000);
	Assert.assertEquals(login.checkTheLogInSucceed(), true);
	Thread.sleep(1000);
}
@Test(priority=4)
public void addToCart() {
	String type=TestDataGenerator.getItemsType();
	cart.addToCart(type);
}
@AfterTest
public void closing() {
	DriverFactory.quitDriver();
}
}

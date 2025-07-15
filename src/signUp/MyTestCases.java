package signUp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyTestCases extends TestData {

MainPage main=new MainPage();
SignUp sign=new SignUp();
Login log=new Login();
LogOff off=new LogOff();
CartPage cart=new CartPage();
@BeforeTest
public void mySetUp() {
	configuration ();
}
@Test(priority=1)
public void navigateToSignPage() throws InterruptedException {
	main.navigateToSignUpPageTest();
}
@Test(priority=2)
public void checkTheSignUpWindow() throws InterruptedException {
	main.checkTheSignUpWindowTest();
}
@Test(priority=3)
public void SignUp() throws InterruptedException {
	sign.signUpTest();
}
@Test(priority=4)
public void checkTheAccountRegistered() {
	sign.checkTheAcountCreated();
}
@Test(priority=5)
public void addItemsToCart() throws InterruptedException {
	cart.addItemsToCartTest();
}
@Test(priority=5)
public void logOut() throws InterruptedException {
	off.logOutTest();
}
//@Test(priority=6)
//public void checkTheTitleOfThePage() {
//main.checkTheTitleOfThePageTest();


//@Test(priority=5)
//public void logIn() throws InterruptedException {
//	log.logInTest();
//}
//@Test(priority=5)
//public void checkTheLogin() throws InterruptedException {
//	Thread.sleep(2000);
//	log.checkTheLoginText();
//}
}


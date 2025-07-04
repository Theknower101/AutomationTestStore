package login;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyTestCases extends TestData {

MainPage main=new MainPage();
SignUp sign=new SignUp();
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

}

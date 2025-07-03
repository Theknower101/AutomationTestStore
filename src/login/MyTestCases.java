package login;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class MyTestCases extends TestData {

MainPage main=new MainPage();
LoginPage login=new LoginPage();
@BeforeTest
public void mySetUp() {
	configuration ();
}
@Test(priority=1)
public void navigateToLoginPage() throws InterruptedException {
	main.navigateToLoginPageTest();
}
@Test(priority=2)
public void checkTheLoginWindow() throws InterruptedException {
	main.checkTheLoginWindowTest();
}
@Test(priority=3)
public void logIn() throws InterruptedException {
	login.logInTest();
}
@Test(priority=4)
public void checkAddressText() throws InterruptedException {
login.checkAddressTextTest();
}

}

package signUp;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class TestData {
	protected static WebDriver driver;
	String logInText="My Account";
	String logOffText="Account Logout";
	String confirmationMessage = " Your Account Has Been Created!";
	protected String loginName;
	protected String passwordValue;
	boolean isExist=true;
	Random rand1=new Random();
	String logInUrl="https://automationteststore.com/index.php?rt=account/login";
	String logOutUrl="https://automationteststore.com/index.php?rt=account/logout";
	String url="https://automationteststore.com/index.php?rt=account/create";
	String urlLoginPage="https://automationteststore.com/index.php?rt=account/login";
	String signUpWindowName="I am a new customer.";
	String firstName[]= {"Ahmad","Mohammad","Talal","Tala","Sara"};
	String lastName[]= {"Allan","Ehsan","AlHussein","Alzboun"};
	String telephone[]= {"0791234567","0791312233","0788556677","0776544561"};
	String password[]= {"Ahmad12345","Mohammad12345","Omar12345","Ali12345"};
	String fax[]= {"5678","1234","2456","0987"};
	String company="Microsoft";
	String address1="Amman";
	String address2="Irbid";
	String city="Arajan";
	String zipCode="0001";
	@BeforeSuite
	public void setUp() {
		if(driver==null) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
	}
	@AfterSuite
	public void tearDown() {
		if(driver !=null) {
			driver.quit();
			driver=null;
		}
	}
	public void configuration () {
		driver.get(url);
		
	}
}

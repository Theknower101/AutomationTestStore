package login;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
public class TestData {
	protected static WebDriver driver;
	boolean isExist=true;
	Random rand1=new Random();
    Random rand2=new Random ();
    Random rand3=new Random ();
	String url="https://automationteststore.com/index.php?rt=account/create";
	String urlLoginPage="https://automationteststore.com/index.php?rt=account/login";
	String loginWindowName="I am a new customer.";
	String firstName[]= {"Ahmad","Mohammad","Talal","Tala","Sara"};
	String lastName[]= {"Allan","Ehsan","AlHussein","Alzboun"};
	String telephone[]= {"0791234567","0791312233","0788556677","0776544561"};
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

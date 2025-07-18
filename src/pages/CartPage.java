package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class CartPage {
WebDriver driver;
public CartPage(WebDriver theDriver) {
	this.driver=theDriver;
}
By continueButtonLocator=By.linkText("Continue");
By containerLocator=By.cssSelector("div[id='block_frame_featured_1769'] a[title='Skinsheen Bronzer Stick']");
By itemsNameLocator=By.className("prdocutname");
public void addToCart(String itemType) {
	driver.get("https://automationteststore.com/index.php?rt=checkout/cart");
	Assert.assertEquals(checkTheCartPage(), true,"The cartPage");
	driver.findElement(continueButtonLocator).click();
	driver.findElement(containerLocator).findElements(By.id(itemType));
	List<WebElement>allItems=driver.findElements(itemsNameLocator);
	allItems.get(0).click();
}
public boolean checkTheCartPage() {
	return driver.getPageSource().contains("Shopping Cart");
}
}

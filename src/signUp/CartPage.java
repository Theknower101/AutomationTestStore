package signUp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage extends TestData {
	public void addItemsToCartTest() throws InterruptedException {
		driver.get(cartUrl);
		verifyTheCart();
		goToCart();
		Thread.sleep(1000);
		WebElement container=driver.findElement(By.xpath("//body/div[@class='container-fixed']/div[@id='maincontainer']/div[1]"));
		int randomType=rand1.nextInt(itemsId.length);
		WebElement itemType=container.findElement(By.id(itemsId[randomType]));
		List<WebElement>allItems=itemType.findElements(By.className("prdocutname"));
		int randomIndexItems=rand1.nextInt(allItems.size());
		allItems.get(randomIndexItems).click();
		Thread.sleep(1000);
		
		verifyTheAvailabilityOfTheItemAndTheSize();
	  
}
	public void verifyTheCart() {
		//Data
		String cartUrlCurrent=driver.getCurrentUrl();
		//Action
		Assert.assertEquals(cartUrlCurrent.contains("checkout/cart"), true);
	}
	public void goToCart() {
		//Element
		WebElement countinueButton=driver.findElement(By.linkText("Continue"));
		//Action
		countinueButton.click();
	}
	public void verifyTheAvailabilityOfTheItemAndTheSize() {
		//Element
		WebElement addToCartButton=driver.findElement(By.className("productpagecart"));
		//Data
		String addToCartText=addToCartButton.getText();
		//Action
		if(addToCartText.contains("Out of Stock ")) {
			driver.navigate().back();
		}
		 else if(driver.getCurrentUrl().contains("product_id=116")) {
			 driver.findElement(By.xpath("//label[@for='option344747']")).click();
		 }
		addToCartButton.click();
	}
}

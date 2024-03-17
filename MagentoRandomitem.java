package magento;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MagentoRandomitem {
	WebDriver driver = new  ChromeDriver();	

	@BeforeTest
	public void MyBeforeTest() {
	
		driver.manage().window().maximize();
	}
	@Test 
	
	public void mytest() throws InterruptedException {
	driver.get("https://magento.softwaretestingboard.com/");

		driver.get("https://magento.softwaretestingboard.com/");  
		WebElement signin = driver.findElement(By.linkText("Sign In"));
		signin.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kherfanduaa@yahoo.com");
		WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Duaakh-1312");
	    WebElement sign=driver.findElement(By.id("send2"));
	    sign.click();
        WebElement myListOfITEMS =	driver.findElement(By.xpath("//ol[@class='product-items widget-product-grid']"));
	    List<WebElement> allItems = myListOfITEMS.findElements(By.tagName("li"));
	    Random rand = new Random(); 
	
	   int randomindex = rand.nextInt(allItems.size()); 
	
	
	   allItems.get(randomindex).click();
	   WebElement addtowish = driver.findElement(By.linkText("ADD TO WISH LIST"));
		addtowish.click();
		
		WebElement search=driver.findElement(By.id("search"));
		search.sendKeys("bag");
		search.submit();
		WebElement Women =driver.findElement(By.linkText("Women"));
	    Women.click();
	    WebElement NOTES =driver.findElement(By.linkText("Notes"));
	    NOTES.click();	
	}
}
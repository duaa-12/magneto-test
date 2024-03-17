package magento;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Inputfields {
	WebDriver driver = new  ChromeDriver();	

	@BeforeTest
	public void MyBeforeTest() {
	
		driver.manage().window().maximize();
	}
	@Test 
	
	public void mytest() {
	driver.get("https://magento.softwaretestingboard.com/");

	driver.findElement(By.linkText("Create an Account")).click();
	WebElement firstname= driver.findElement(By.id("firstname"));
	firstname.sendKeys("duaa");
	driver.findElement(By.tagName("input")).sendKeys("duaa");
	WebElement lastname= driver.findElement(By.id("lastname"));
	lastname.sendKeys("kherfan");
	WebElement email= driver.findElement(By.id("email_address"));
	email.sendKeys("duaakherfan@yahoo.com");
	WebElement pass= driver.findElement(By.id("password"));
	pass.sendKeys("Duaa-13122000");
	WebElement passcon= driver.findElement(By.id("password-confirmation"));
passcon.sendKeys("Duaa-13122000");
	WebElement craetanaccount = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
   craetanaccount.click();
	WebElement theform= driver.findElement(By.id("form-validate"));
	List<WebElement> myinputfiel=theform.findElements(By.tagName("input"));
	for(int i=0; i<myinputfiel.size();i++) {
		if (myinputfiel.get(i).getAttribute("type").equals("hidden")){
	continue;
		}else {
		myinputfiel.get(i).sendKeys("duaa");
		}
}
}
}

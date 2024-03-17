package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Creataccount {
	String URL = "https://magento.softwaretestingboard.com/";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest

	public void mySetup() {
		driver.manage().window().maximize();
	}
	
	@Test
	public void aCreataccount() {
		driver.get(URL);
		WebElement crataccount = driver.findElement(By.partialLinkText("Create"));
		crataccount.click();
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("duaa");
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("kherfan");
		WebElement email = driver.findElement(By.id("email_address"));
		email.sendKeys("kherfanduaa@yahoo.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Duaakh-1312");
		WebElement confirmpassword=driver.findElement(By.id("password-confirmation"));
	    confirmpassword.sendKeys("Duaakh-1312");
		WebElement Creatanaccount=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
		Creatanaccount.click();
}
}
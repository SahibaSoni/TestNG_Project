package variousCon;

import java.util.concurrent.TimeUnit;

//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;
	

    @BeforeMethod
	public void launcBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void posTest() 
	{
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(3000);
		
	}
	@Test
	public void accMethod()
	{
		//posTest();
		driver.findElement(By.xpath("//span[text() = 'Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text() = 'New Account']")).click();
		
		
		driver.findElement(By.xpath("//input[@id = 'account']")).sendKeys("Sahiba Saving Account101");
		driver.findElement(By.xpath("//input[@id = 'description']")).sendKeys("Wants to open new account");
		driver.findElement(By.xpath("//input[@id = 'balance']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id = 'account_number']")).sendKeys("111-1111-1111");
		driver.findElement(By.xpath("//input[@id = 'contact_person']")).sendKeys("Sahiba Soni");
		driver.findElement(By.xpath("//input[@id = 'contact_phone']")).sendKeys("2065492307");
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		

	}

}

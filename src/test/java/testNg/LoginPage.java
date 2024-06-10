package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
public class LoginPage {

	WebDriver driver;
	
	@Test
	public void loginButtonClick(){
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait (Duration. ofSeconds (30));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id=\"login_Layer\"]")).click();
	    driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("meenakshi1998.05@gmail.com");
	    driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("meenakshi@123");
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
}

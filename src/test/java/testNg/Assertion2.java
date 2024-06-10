


package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion2 {

	WebDriver driver;
	
	@Test
	public void navigateToURL() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait (Duration. ofSeconds (30));
	driver.get("https://www.naukri.com/");
	}
	
	@Test
	public void validateTextNaukri() {
		String expectedText = "Naukri";
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']")).isDisplayed());
		System.out.println("The test case passed");
	}
	
	@Test
	public void validateTextJob() {
		String expectedText = "Jobs";
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title=\"Search Jobs\"]")).isDisplayed());
		System.out.println("The test case passed");
	}
	
	@Test
	public void validateTextCompanies() {
		String expectedText = "Companies";
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title=\"Explore top companies hiring on Naukri\"]")).isDisplayed());
		System.out.println("The test case passed");
	}
	
	
	@Test
	public void validateTextServices() {
		String expectedText = "Services";
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title=\"Naukri FastForward- Resume Services\"]")).isDisplayed());
		System.out.println("The test case passed");
	}

	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
}

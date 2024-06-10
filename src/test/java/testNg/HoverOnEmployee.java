package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HoverOnEmployee {
	
	WebDriver driver;
	
	@Test
	
	public void hoverOnForEmployers(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	WebElement employers = driver.findElement(By.xpath("//div[text()=\"For employers\")]"));

	
	Actions act =  new Actions(driver);
	act.moveToElement(employers).build().perform();
	
    
	}
	
	@Test
	public void dropdownSelectExperience() throws InterruptedException
	
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@id='expereinceDD']")).click();
		WebElement experience = driver.findElement(By.xpath("//ul[@class='dropdown ']//li"));
		Select year = new Select(experience);
		Thread.sleep(2000);
		year.selectByVisibleText("3 years");
		 System.out.println(experience.getText());
	
	}
	
	@Test
	public void enterSkills(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("QA engineer");
	}
	
	@Test
	public void enterLocation(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("Gurgoan");
	driver.findElement(By.xpath("//div[text()=\"Search\"]")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
	
	
}

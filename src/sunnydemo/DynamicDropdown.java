package sunnydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		/*
		 * normal drop down
		 * 
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		
	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Bhopal (BHO)")).click();
		
		
		*/
		
		//dynamic drop down
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
}

	
}
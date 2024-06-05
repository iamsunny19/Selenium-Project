package sunnydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectCheckBox {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
			System.out.println((driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected()));
			driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();		
			System.out.println((driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected()));
			
			Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
			
			driver.findElement(By.xpath("//div/div/button[@class='ui-datepicker-trigger']")).click();	
			Thread.sleep(1000);
			driver.findElement(By.linkText("8")).click();			
			
			
			
		List<WebElement> options =driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement option :options)
		{
		System.out.println(options);
		}
		
		
		Thread.sleep(3000);
		
		for(WebElement option: options)
		{
			
			if(option.getText().equalsIgnoreCase(" Indian Armed Forces"))
			{
				option.click();
				break;
			}
		}
		
		}


			
			
			
			
		
			
		}


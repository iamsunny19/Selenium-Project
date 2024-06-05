package sunnydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']"));
		//List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//ul/li[@class='ui-menu-item']
		
		for (WebElement option :options)
		{
			System.out.println(option);
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India"))
			{
				
				Thread.sleep(1000);
				option.click();
				break;
			}
		}
		
		
	
		
		
		
			
			}
	
}

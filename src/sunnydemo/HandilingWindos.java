package sunnydemo;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandilingWindos {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	
	
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
	
		Set <String> windows=driver.getWindowHandles();
	Iterator <String> it= windows.iterator();
	String parent =it.next();
	String child = it.next();
	
	driver.switchTo().window(child);
	
	String userString =driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.id("username")).sendKeys(userString);
	
	}
	
}

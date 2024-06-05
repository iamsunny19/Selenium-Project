package sunnydemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Actions a =new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		a.moveToElement(move).build().perform();
		
	Thread.sleep(3000);
		
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		
		
		
		
		
	}

}

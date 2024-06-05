package sunnydemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Sunny";
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		driver.manage().window().minimize();

		/*
		 * driver.findElement(By.cssSelector("input[placeholder='Enter Your Name'")).
		 * sendKeys(textString);
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("alertbtn")).click(); Thread.sleep(1000);
		 * 
		 * driver.switchTo().alert().accept(); String s =
		 * driver.switchTo().alert().getText(); Thread.sleep(2000);
		 * System.out.println(s);
		 * 
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * driver.findElement(By.cssSelector("input[placeholder='Enter Your Name'")).
		 * sendKeys(textString);
		 * driver.findElement(By.cssSelector("input[onclick='displayConfirm()']")).click
		 * (); Thread.sleep(1000);
		 * System.out.println("driver.switchTo().alert().getText()");
		 * driver.switchTo().alert().dismiss();
		 * System.out.println("driver.switchTo().alert().getText()");
		 * 
		 */
	}

}

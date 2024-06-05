package sunnydemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {
	
	 
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			
			
			
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			// giving implicit wait 
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
			Thread.sleep(1000);
			
			String password= driver.findElement(By.className("infoMsg")).getText();
			driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
			String [] passwordarry= password.split("'");
			
			String main[]=passwordarry[1].split("'");
			String pwd=main[0];
			
			System.out.print(pwd);
}
}
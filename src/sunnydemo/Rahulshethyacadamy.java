/**
 * 
 */
package sunnydemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * 
 */
/**
 * 
 */
public class Rahulshethyacadamy {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// giving implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
 
	    driver.findElement(By.id("inputUsername")).sendKeys("Sunny");
	    driver.findElement(By.name("inputPassword")).sendKeys("Sunny");
	    driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
	    driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
	    driver.findElement(By.className("signInBtn")).click();
	  
	    
	    
	    // here we will use implicit wait for getting text
	
	    String k= driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(k);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sunny Kashyap");
		//driver.close();		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sunnykumarkashyap19@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number'][1]")).sendKeys("7257931381");
	
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
	
		String l= driver.findElement(By.className("infoMsg")).getText();
		
		System.out.println(l);
		
		
		driver.findElement(By.xpath("//form/input[@placeholder='Name']")).sendKeys("Sunny Kashyap");
		
		driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys("sunnykumarkashyap19@gmail.com");
		
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("7257931381");
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("Sunny Kashyap");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        
        driver.findElement(By.cssSelector("button.signInBtn")).click(); 
        Thread.sleep(2000);
        
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(2000);
        driver.close();		
		
		
	}

}

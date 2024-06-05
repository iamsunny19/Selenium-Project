package sunnydemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class To_obtain_password {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// giving implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String pass =GetPassword(driver);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);

		   driver.findElement(By.id("inputUsername")).sendKeys("Sunny");
		    driver.findElement(By.name("inputPassword")).sendKeys(pass);
		    driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		    driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
		    driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(2000);
        		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
		}


public static String GetPassword(WebDriver driver) throws InterruptedException
{ 
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
	Thread.sleep(1000);
	
	String password= driver.findElement(By.className("infoMsg")).getText();
	
	
	String [] passwordarry= password.split("'");
	
	String main[]=passwordarry[1].split("'");
	String pwd=main[0];

	return pwd;
	
	
	
	
	
}
}

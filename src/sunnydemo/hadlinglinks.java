package sunnydemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hadlinglinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

	Assert.assertEquals(driver.findElements(By.tagName("a")).size(), 27);
	
	
	System.out.println("matched");
	
	
	WebElement footer =driver.findElement(By.id("gf-BIG"));
	
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	
	WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	int c= column.findElements(By.tagName("li")).size();
	System.out.println(column.findElements(By.tagName("li")).size());
	
	
	

	for (int i=1;i<c;i++)
		
	{
		//column.findElements(By.tagName("a")).get(i).click();	
		
	String clickonlink=	Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	 column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
	 Thread.sleep(5000L);
	}
	Set <String> windows =driver.getWindowHandles();
	Iterator <String> it =windows.iterator();	
	String parent =it.next();
	 while(it.hasNext())
	 {
		 driver.switchTo().window(it.next());
		 Thread.sleep(5000L);
		 System.out.println(driver.getTitle());
		 
		
	 }
	 driver.switchTo().window(parent);
	
	System.out.println("HI");
	
	
	}

}

package sunnydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		
		//div[@class='tableFixHead']/table/tbody/tr/td[4]
	 List <WebElement> options =driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]"));
	 
	 int sum=0;
	 for(int i =0;i<options.size();i++)
	 {
		sum =sum + Integer.parseInt(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]")).get(i).getText());
		 
	 }
System.out.println(sum); 
	}

}

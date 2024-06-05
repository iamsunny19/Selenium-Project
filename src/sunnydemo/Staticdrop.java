package sunnydemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdrop {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		
		//select with static drop down 
		WebElement staticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select (staticDrop);
		dropdown.selectByIndex(3);
       System.out.println(dropdown.getFirstSelectedOption().getText());
		
        Thread.sleep(2000);
		
		 dropdown.selectByVisibleText("AED");
		
		
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		driver.close();
		
		
		
		
		
		
		
		
}
}
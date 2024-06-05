package sunnydemo;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Https {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions ch = new ChromeOptions();
		
		ch.setAcceptInsecureCerts(true);
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver(ch);
		driver.get("https://expired.badssl.com/");
		//Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Users/sunnkumar/screenshot.png"));
		
		
		
	System.out.println(driver.getTitle());		
	
		
		
		

	
	}

}

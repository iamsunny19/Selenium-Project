package sunnydemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

	    //System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	List <WebElement> links	=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	 SoftAssert a =new SoftAssert();
	for(WebElement i :links)
	{
		String url=i.getAttribute("href");
		String nameString = i.getText();

        HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();

        conn.setRequestMethod("HEAD");

        conn.connect();
        
        int respCode = conn.getResponseCode();
        
        System.out.println(respCode);
      
        a.assertTrue(respCode<400, " this link is Broken "+" ' "+nameString+" ' "+"  with responce code "+respCode);
		
	}
	 a.assertAll();	
	 
	 driver.close();
	}

}

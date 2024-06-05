package sunnydemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HanddleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
	List<WebElement> options =driver.findElements(By.tagName("iframe"));
		int c=0;
		for (WebElement i :options)
		{
			c++;
		
		}
		
		System.out.println(c);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.switchTo().frame(0);
		// driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);

		WebElement source = driver.findElement((By.id("draggable")));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();

	}

}

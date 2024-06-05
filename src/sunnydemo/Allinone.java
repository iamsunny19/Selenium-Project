package sunnydemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Allinone {

	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	Thread.sleep(2000);
	/*
	 * normal drop down
	 * 
	driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	

	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Bhopal (BHO)")).click();
	
	
	*/
	
	//dynamic drop down
	driver.findElement(By.xpath("//a[@value='BHO']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

	
	
	
	
	Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
	System.out.println((driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected()));
	driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();		
	System.out.println((driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected()));
	
	Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
	
	driver.findElement(By.xpath("//div/div/button[@class='ui-datepicker-trigger']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.linkText("8")).click();			
	
	
	
List<WebElement> options =driver.findElements(By.cssSelector("input[type='checkbox']"));
for(WebElement option :options)
{
System.out.println(options);
}


Thread.sleep(3000);

for(WebElement option: options)
{
	
	if(option.getText().equalsIgnoreCase(" Indian Armed Forces"))
	{
		option.click();
		break;
	}

	
}



Thread.sleep(2000);


//select with static drop down 
//WebElement staticDrop = driver.findElement(By.id("divpaxinfo"));
//Select dropdown=new Select (staticDrop);

driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);

for(int i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
driver.findElement(By.id("btnclosepaxoption")).click();




Thread.sleep(2000);


//select with static drop down 
WebElement staticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown=new Select (staticDrop);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());

Thread.sleep(2000);

 dropdown.selectByVisibleText("AED");


 System.out.println(dropdown.getFirstSelectedOption().getText());

driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

}
}



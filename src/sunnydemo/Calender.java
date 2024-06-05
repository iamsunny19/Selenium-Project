package sunnydemo;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/sunnkumar/Desktop/selenium/driver/chromedriver.exe");



		Scanner sc = new Scanner(System.in);
		System.out.println("Hey please Enter the date (dd/mm/yyyy) format ");

		String date = sc.nextLine();

		String split[] = date.split("/");
		String day = split[0];
		String month = split[1];
		String year = split[2];
		String adj=month;
		/*
		 * System.out.println(day);
		 * 
		 * System.out.println(month); System.out.println(year);
		 */
	
		int dayInt = Integer.parseInt(day);
		int monthInt = Integer.parseInt(month);
		int yearInt = Integer.parseInt(year);

		if (dayInt >= 1 && dayInt <= 31 && monthInt >= 1 && monthInt <= 12 && yearInt >= 2023 && yearInt <= 2099) 
		{
			// Date is valid, you can perform further actions here
			System.out.println("Valid date entered.");

			if (day.length() == 2) {

				if (month.length() == 2) {

					if (year.length() == 4) {

						if (month.contains("01")) {
							adj = "January";
							System.out.println(adj);
						} else if (month.contains("02")) {
							adj = "Febraury";
							System.out.println(adj);
						} else if (month.contains("03")) {
							adj = "March";
							System.out.println(adj);
						} else if (month.contains("04")) {
							adj = "April";
							System.out.println(adj);
						} else if (month.contains("05")) {
							adj = "May";
							System.out.println(adj);
						} else if (month.contains("06")) {
							adj = "June";
							System.out.println(adj);
						} else if (month.contains("07")) {
							adj = "July";
							System.out.println(adj);
						} else if (month.contains("08")) {
							adj = "August";
							System.out.println(adj);
						} else if (month.contains("09")) {
							adj = "September";
							System.out.println(adj);
						} else if (month.contains("01")) {
							adj = "October";
							System.out.println(adj);
						} else if (month.contains("11")) {
							adj = "November";
							System.out.println(adj);
						} else if (month.contains("12")) {
							adj = "December";
							System.out.println(adj);
						}

						
						
					} else {

						System.out.println("please enter in right format of year");
					}

				}

				else {

					System.out.println("please enter in right format of month");
				}

			} else {

				System.out.println("please enter in right format of day");
			}

		}

		else

		{
			System.out.println("Invalid date. Please enter a valid date.");
			
		}
		
		

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/");

		driver.findElement(By.id("datepicker")).click();

//	System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText());
	//System.out.println(adj+" "+year);	
	
	while (!driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText()
				.contains(adj+" "+year))
	{

			driver.findElement(By.cssSelector("span[class ='ui-icon ui-icon-circle-triangle-e']")).click();

			System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText());
			
			String expectedText = adj+ " " +year;
			String getString =expectedText.trim();
			System.out.println("what we want "+expectedText);
			
			//System.out.println("what we get"+driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText());
		if (driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText().trim().equalsIgnoreCase(getString))
			{
			System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText());
			System.out.print(expectedText);
			//break;
			
			
		
		  List<WebElement> options = driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

			for (int i = 0; i < options.size(); i++)
			{
				// driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText().contains("23");

				if (driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText().equalsIgnoreCase(day))
				{
					System.out.println(driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText());
					driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
					
					break;
				}
			   System.out.println(driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText().contains("23"));
		   }
		
		
		}
	}
		
	 

}
}

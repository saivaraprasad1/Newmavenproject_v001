package webapplications;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	
	// public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        @Test 
        public void datepicker() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
		////div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody//tr[3]/td[7]
		String value = "18";
		Thread.sleep(5000);
		WebElement Calendartitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[contains(text(),'May')]"));
		WebElement Calendaryear = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[contains(text(),'2022')]"));
		System.out.println("The picked month from the calendar picker is :" + Calendartitle.getText() +  Calendaryear.getText());
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//thead//tr"));
		
		for(WebElement weekdays : list )
		{
			System.out.println("The weedays in the calendar are : " + weekdays.getText());	
		}
		
		Thread.sleep(5000);
		List<WebElement> calendardates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//table[@class = 'ui-datepicker-calendar']//tr"));
		//int totalrows = calendardates.size();
		System.out.println("The total dates in the calendar are : " + calendardates.size());
		
		for(WebElement date : calendardates)
		{
		
			   System.out.println("the dates from the calendar row are :" + date.getText());
				
		}
			
		
	    List<WebElement> totalcolumns = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//table[@class = 'ui-datepicker-calendar']//tr//td"));
	//	int columns = totalcolumns.size();
	    System.out.println("The number of columns in the calendar picker is : " + totalcolumns.size());
		
	   for(WebElement date : totalcolumns)
	   { 
   		    String expected = date.getText();
			if (expected.equals(value))
			{
			    date.click();
			    break;
		  }
		}
   }		
	
}

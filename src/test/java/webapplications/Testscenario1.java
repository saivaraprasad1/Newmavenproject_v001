package webapplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testscenario1 {

     @Test
     public void setup() throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();			
			driver.get("https://app.bloomz.net");
			driver.findElement(By.linkText("Sign In")).click();
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("prasad@bloomz.net");
		    Thread.sleep(3000);
		    driver.findElement(By.id("loginForm_password")).sendKeys("bloomz999");
		    driver.findElement(By.id("login_signin")).click();
		    
		    driver.quit();	    
     }
     
     @Test
     public void studentlogin() throws InterruptedException {
    	 
    	 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();			
			driver.get("https://app.bloomz.net");   
			driver.findElement(By.xpath("//a[contains(text(),'Enter Code')]")).click();
			driver.findElement(By.xpath("//input[@id='loginForm_username']")).sendKeys("7SVFBG");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Signout')]")).click();
			driver.quit();
		//	driver.findElement(By.xpath("//section//a//span[@class ='profileM']")).click();
		//	Thread.sleep(3000);
	    // driver.findElement(By.xpath("//a[contains(text(),'Switch')]")).click();
			
    	 
     }
	
}

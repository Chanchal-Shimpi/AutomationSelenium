package day2Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Assiognment2Firefox {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get url
		driver.get("https://demowebshop.tricentis.com/login");
		
		//get page title
		String actualtitle=driver.getTitle();
		System.out.println("title of page="+actualtitle);   
		//title length       
		System.out.println("number of characters in Demo web shop="+actualtitle.length());
		//get current url
		System.out.println("current url="+driver.getCurrentUrl());
		
		//identify email
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		
		//identify password
		driver.findElement(By.name("Password")).sendKeys("Abc@12345");
		
		//Identify login button
        driver.findElement(By.className("login-button")).click();
        
      //waiting for logout link to be clickable
      		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)//new
      		.withTimeout(Duration.ofSeconds(30))//total time 
      		.pollingEvery(Duration.ofSeconds(5))//retry time
      		.ignoring(NoSuchElementException.class);//exception handling while re-try
      		
      		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
      		driver.findElement(By.id("logoutLink")).click();
      		 //close current browser
            driver.close();

	}

}
/*Launch a new firefox browser.
Open https://demowebshop.tricentis.com/login
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter username as “tester01@vomoto.com”
Enter password as “Abc@12345”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.*/
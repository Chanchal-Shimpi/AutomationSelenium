package day2Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get url
		driver.get("https://online.actitime.com/cts1/login.do");
		
		//get page title
		String actualTitle=driver.getTitle();
		System.out.println("title of page="+actualTitle);   
		//get character count/title length in actitime
		System.out.println("number of characters in title="+actualTitle.length());
		//identify username
		driver.findElement(By.name("username")).sendKeys("admin01");
				
		//identify password
		driver.findElement(By.name("pwd")).sendKeys("admin01");
				
		//Identify login button
        driver.findElement(By.className("login-button"));
      //close current browser
        driver.close();

		
		
		
		
		

	}
}
/*
Launch a new Chrome browser.
Open https://online.actitime.com/tcs/login.do
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter valid username and password (admin01/admin01)
Click on login button
Print the title on the console
Close the Browser.


Close the Browser.
Close the Browser.



*/
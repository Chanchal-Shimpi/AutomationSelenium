package day3browseoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//username and password, store it into a variable
			String userName=driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
			System.out.println("Username: "+userName); 
			 
			
			
			String password=driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
			System.out.println("Password: "+password);
			
			//identify username
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			//identify password
			driver.findElement(By.name("password")).sendKeys("Admin123");
			
			//Identify login button
			driver.findElement(By.cssSelector(".oxd-button" )).click();
			
			
			
					
			

		}

	}
	/*
	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	get the username and password from the application and store it into a variable

	enter username 
	enter password
	click on login button
	*/


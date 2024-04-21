package day2Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4OrangeHRM {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	//get app url
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//identify username
	driver.findElement(By.name("username")).sendKeys("Admin");//not requires webElement
	
	//identify password
	driver.findElement(By.name("password")).sendKeys("admin123");//no such element exception
	
	//Identify login button
	driver.findElement(By.className("main orangehrm-login-button")).click();
	
	
	
	
	}

}
/*
here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

*/

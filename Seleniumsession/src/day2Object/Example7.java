package day2Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage(). timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/cts1/login.do");//0-30 sec
		
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30 sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30 sec
		driver.findElement(By.id("loginButton")).click();
		
		//to get home page title,we need to use conditional wait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//we can implement req wait condition
		//wait.until(ExpectedConditions.titleIs("actiTIME-Licenses"));
		//System.out.println("home page title="+driver.getTitle());
		
		//waiting for logout link to be clickable
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)//generic//yellow lines
		.withTimeout(Duration. ofSeconds(30))//total time
		.pollingEvery(Duration. ofSeconds(20))//retry time
		.ignoring(NoSuchElementException.class);//exception handling while re-try
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("LogoutLink")).click();
		
		
		
		

	}

}

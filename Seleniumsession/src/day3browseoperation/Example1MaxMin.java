package day3browseoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1MaxMin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to get maximize window
		driver.manage().window().maximize();
		//minimize window
		driver.manage().window().minimize();
		//when you want window as per our choice
		driver.manage().window().setSize(new Dimension(400,600));
		//again maximize
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
        //driver.findElement(By.className("ico-register")).click();
	}

}

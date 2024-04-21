package day5MultioleElementCssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
	    //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get url
		driver.get("https://online.actitime.com/cts1/login.do");
		
		driver.findElement(By.cssSelector("input[Placeholder='Username']")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[Placeholder='Password']")).sendKeys("admin01");
		driver.findElement(By.cssSelector(""));
		

	}

}

package day2Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5TimeLimit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//implicit wait//used as default wait for webdriver instance
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//get app url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//0-30 sec
		//identify username
		driver.findElement(By.name("username")).sendKeys("Admin");//not requires webElement//0-30 sec
		
		//identify password
		driver.findElement(By.name("password")).sendKeys("admin123");//no such element exception//0-30 sec
		
		//Identify login button
		driver.findElement(By.className(" orangehrm-login-button")).click();
  }
}
/*here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

Sync
 *
  implicit wait
  explicit wait=conditional wait
  
*/

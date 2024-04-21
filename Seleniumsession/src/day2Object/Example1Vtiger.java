package day2Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1Vtiger {

	public static void main(String[] args) {
		//enter required browser
		ChromeDriver driver=new ChromeDriver();
		//get url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//identify username
		WebElement usernameInputFild=driver.findElement(By.id("Username"));
		//delete existing username
		usernameInputFild.clear();
		//enter username admin
		usernameInputFild.sendKeys("admin");
		
		//for password, identify password
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		//delete existing password
		passwordInputField.clear();
		//enter password admin
		passwordInputField.sendKeys("admin");
		
		//identify login button
		WebElement signInButton=driver.findElement(By.className("buttonblue"));
		//click on sign in
		signInButton.click();	
		
/* open browser//manually
 * open url of app
 * identify usernameInputField
 * delete existing username
 * enter username admin
 * identify password
 * delete existing password
 * enter password admin
 * identify login button
 * click on sign in button
 * 
 */
		}

}

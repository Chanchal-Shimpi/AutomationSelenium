package day3browseoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// username input field validation
		WebElement userNameInputField = driver.findElement(By.className("oxd-input"));
		System.out.println("Username input field, visible or not? " + userNameInputField.isDisplayed());
		System.out.println("Username input field, editable or not? " + userNameInputField.isEnabled());
		System.out.println("Username input field, default text displayed: " + userNameInputField.getAttribute("placeholder"));
		

		// password input field validation
		WebElement passwordInputField = driver.findElement(By.className("oxd-input")); 
		System.out.println("password input field, visible or not? " + passwordInputField.isDisplayed());
		System.out.println("password input field, editable or not? " + passwordInputField.isEnabled());
		System.out.println("password input field, default text displayed: " + passwordInputField.getAttribute("placeholder"));
		
		
		// login button validation
				WebElement loginButton = driver.findElement(By.className("oxd-button"));
				System.out.println("loginButton, visible or not? " + loginButton.isDisplayed());
				System.out.println("loginButton, clickable or not? " + loginButton.isEnabled());
				System.out.println("loginButton, button name: " + loginButton.getText());
           
	    //validation of forget your password
				WebElement ForgetYourPassword = driver.findElement(By.className("oxd-text"));
				System.out.println("ForgetYourPassword, visible or not? " + ForgetYourPassword.isDisplayed());
				System.out.println("ForgetYourPassword, clickable or not? " + ForgetYourPassword.isEnabled());
				System.out.println("ForgetYourPassword, link name: " + ForgetYourPassword.getText());
           
				

	}

}
/*
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 * Admin/admin123
 * 
 * validation: Username: visible or not ---> editable or not---> default
 * value--->
 * 
 * password: visible or not ---> editable or not---> default value--->
 * 
 * Login button: visible or not---> clickable or not---> button name--->
 * 
 * Forgot your password? visible or not---> clickable or not---> link name--->
 * 
 */

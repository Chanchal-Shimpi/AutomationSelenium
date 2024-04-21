package day1seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//application url
		driver.get("https://www.google.com");
		
		//get application title
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		
		System.out.println("number of character in applicationtitle="+actualTitle.length());
        System.out.println("is google page opened?="+actualTitle.equals(expectedTitle));
        
        //get current url from browser
        System.out.println("current url of application="+driver.getCurrentUrl());
        
        //get application source code
        String pageSource=driver.getPageSource();
        System.out.println("char in page source="+pageSource.length());
        
        //close current browser
        driver.close();


}
}

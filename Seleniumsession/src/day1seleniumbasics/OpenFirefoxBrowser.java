package day1seleniumbasics;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class OpenFirefoxBrowser {

		public static void main(String[] args) {
			// Create an instance of required browser class
			FirefoxDriver driver=new FirefoxDriver();
			
			//enter required application URL
			driver.get("https://www.google.com");
			
			//get application title
			String actualTitle=driver.getTitle();
			String expectedTitle="Google";
			
			System.out.println("Number of character in application title: "+actualTitle.length());
			System.out.println("Is google page opened ? "+actualTitle.equals(expectedTitle));
			
			//get current url from browser
			System.out.println("Current url of application "+driver.getCurrentUrl());
			
			//get application source code
			String pageSource=driver.getPageSource();
			System.out.println("Char in page source: "+pageSource.length());
			
			//close current browser
			driver.close();
		}

	}



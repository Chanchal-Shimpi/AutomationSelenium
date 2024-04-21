package day6DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCountryDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		//identify and click on country dropdown
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		//identify all options of dropdown
		List<WebElement> countryList=driver.findElements(By.cssSelector(".form-control "));
		
		System.out.println("Count: "+countryList.size());
		
		for(int i=0;i<countryList.size();i++) {
			System.out.println(countryList.get(i).getText());
		}
		
		countryList.get(4).click();		
	}

}

package day6DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRedBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		
		// click on from
		driver.findElement(By.id("src")).sendKeys("Swargate");
		driver.findElement(By.id("dest")).sendKeys("Panjim");
		driver.findElement(By.cssSelector(".labelCalendarContainer>i")).click();
		
		driver.findElement(By.className("DayTiles__CalendarDaysSpan-sc-1xum02u-1")).click();
		//driver.findElement(By.className(" ")).click();
		//driver.findElement(By.id("search_button")).click();
	    
	}
	

}

/*Open Redbus.in
From Pune
To Goa   
Date in future
Click on search button
Departure time should be after 6am
Bus type “AC”
Get the bus name along with its price

for freezing screen
setTimeout(function(){debugger;}, 5000)
 */
package day5MultioleElementCssSelector;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRegistration {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify automation demo site upper ribbon present in the page		
		List<WebElement> upperList=driver.findElements(By.cssSelector(".collapse>ul>li>a"));
		
		
		System.out.println("upper list count : "+upperList.size());
		
		for(int i=0;i<upperList.size();i++) {
//			WebElement element=deviceList.get(i);
//			String deviceName=element.getText();
//			System.out.println("device name: "+hrefLink);
					//or
			System.out.println("upper list name: "+upperList.get(i).getText());


	}

}
}

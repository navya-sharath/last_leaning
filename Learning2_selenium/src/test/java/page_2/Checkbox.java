package page_2;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//child::input[@type='checkbox']"));
		
		
		String input="monday";
		//mul
		
		Thread.sleep(2000);
		
		for(WebElement day:days) {
			System.out.println(days);
			if(day.isSelected()) {
				day.click();
				//System.out.println(days);
				
			}
			String week_day = day.getAttribute("value");
			if(week_day.equalsIgnoreCase(input)) {
				
				day.click();
				
				
			}
			
		}
		//driver.quit();

	}

}

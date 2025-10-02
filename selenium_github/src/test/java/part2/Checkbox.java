package part2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		
		List<WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box:boxes) {
			if(!box.isSelected()) {
				Thread.sleep(2000);
				box.click();
			}
			Thread.sleep(2000);
			for(WebElement box2:boxes) {
				box2.click();
				
			}
			
			
		}

	}

}

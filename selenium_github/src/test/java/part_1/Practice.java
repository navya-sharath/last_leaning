package part_1;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		WebElement fristName = driver.findElement(By.id("text1"));
		fristName.sendKeys("navya");
		
		List<WebElement> vehicals = driver.findElements(By.xpath("//input[@type='checkbox']"));
		String input="boat";
		for(WebElement vehical:vehicals) {
			if(vehical.isSelected()) {
			vehical.click();
			
		}
			
		/*	String select = vehical.getAttribute("value");
			if(input.equalsIgnoreCase(select)) {
				vehical.click();
			}*/
			Thread.sleep(2000);
		for(WebElement vehical1:vehicals) {
			 vehical1.click();
			
		}
			
		}
		WebElement male = driver.findElement(By.id("radio1"));
		WebElement female = driver.findElement(By.id("radio2"));
		String input2="female";
		if(male.getAttribute("value").equalsIgnoreCase(input2)) {
			System.out.println(male);
			male.click();
			
		}
		else if(female.getAttribute("value").equalsIgnoreCase(input2)) {
			System.out.println(female);
			female.click();
			
		}
		WebElement dropdown = driver.findElement(By.id("Carlist"));
		Select sc=new Select( dropdown);
		Thread.sleep(2000);
		sc.deselectByIndex(2);
		Thread.sleep(2000);
		sc.deselectByIndex(4);
	}

}


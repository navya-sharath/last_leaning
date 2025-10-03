package part2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		WebElement click = driver.findElement(By.id("restart-ad"));
		click.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-footer']")).click();
		
		

	}

}

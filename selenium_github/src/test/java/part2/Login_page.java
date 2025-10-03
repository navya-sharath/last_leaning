package part2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		
		WebElement user_name = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		user_name.sendKeys("navya krishna");
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.sendKeys("sharath");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.submit();
	}

}

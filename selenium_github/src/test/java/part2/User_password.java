package part2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_password {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2));
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("navya@gmail.com");
		Thread.sleep(2000);
	   WebElement submit = driver.findElement(By.id("form_submit"));
	   submit.submit();
	}

}

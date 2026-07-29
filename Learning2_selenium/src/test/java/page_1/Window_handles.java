package page_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		//capture element
		//WebElement facebook = driver.findElement(By.xpath("//span[text()='Share to facebook']"));
		WebElement printrest = driver.findElement(By.xpath("//span[text()='Share to Pinterest']"));
		WebElement twiter = driver.findElement(By.xpath("//span[text()='Share to X']"));
		Thread.sleep(2000);
		//scroll
		Actions ac=new Actions(driver);
		ac.scrollToElement(twiter).build().perform();
		Thread.sleep(2000);
		//click elements
		//facebook.click();
		Thread.sleep(2000);
		printrest.click();
		Thread.sleep(2000);
		//twiter.click();
		
		//window handels
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> i = wh.iterator();
		 String parent_window = i.next();
		//String face_book = i.next();
		String print_rest = i.next();
		//String twit = i.next();
		driver.switchTo().window(print_rest);
		System.out.println(driver.getTitle());

		driver.findElement(By.id("email")).sendKeys("navya@gmail.com");
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("text1")).sendKeys("vidhaan");
		

		
		
	}

}

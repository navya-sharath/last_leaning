package part_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Luma_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		driver.findElement(By.xpath("//a[@role='button']")).click();
		
		List<WebElement> Tops = driver.findElements(By.xpath("//div[@class='we-product-grid-container']"));
		//List<WebElement> colours = driver.findElements(By.xpath("//div[@class='we-Product-radio marker checkbox-inline']"));
		Thread.sleep(2000);
		for(WebElement top:Tops) {
			String productname = top.getText();
			System.out.println("testing top"+productname );
			top.click();
			try {
			WebElement colour = driver.findElement(By.xpath("//div[@style='background-color: purple;']"));
					colour.click();
			System.out.println("colour selected for"+productname);
			}catch(Exception e) {
				System.out.println("no colour option for"+productname);
			}
			try {
			WebElement size = driver.findElement(By.xpath("//div[@class='checkbox'][3]"));
			size.click();
			System.out.println("size selected for"+productname);
			}catch(Exception e) {
				System.out.println("no size option for"+productname);
			}
			driver.findElement(By.xpath("//button[@type='submit']")).submit();
			
		System.out.println();
			
		}
		
		

	}

}

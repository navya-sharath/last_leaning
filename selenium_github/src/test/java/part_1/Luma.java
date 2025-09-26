package part_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Luma {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://luma.enablementadobe.com/content/luma/us/en.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			Thread.sleep(2000);
			WebElement dress = driver.findElement(By.xpath("//li[@class='foundation-list-item'][3]"));
			dress .click();
			Thread.sleep(2000);
			WebElement colour = driver.findElement(By.xpath("//div[@style='background-color:Purple;']"));
			 colour.click();
			 Thread.sleep(2000);
			WebElement size = driver.findElement(By.xpath("//div[text()='M']"));
			size.click();
			Thread.sleep(2000);
			WebElement button = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			Thread.sleep(2000);
			button.submit();
			driver.findElement(By.xpath("//a[@class='we-Cart-button']")).click();
			WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-action pull-right']"));
			checkout.click();
			WebElement checking = driver.findElement(By.xpath("//a[@role='button']"));
			checking.click();
			WebElement chech_firstname = driver.findElement(By.name("shipping.firstname"));
			Thread.sleep(2000);
			chech_firstname.sendKeys("navya");
			
			WebElement lastname = driver.findElement(By.name("shipping.lastname"));
			Thread.sleep(2000);
			 lastname.sendKeys("krishna");
			WebElement adresslineone = driver.findElement(By.name("shipping.street1"));
			Thread.sleep(2000);
			 adresslineone.sendKeys("state highway 121");
			WebElement shreetadreestwo = driver.findElement(By.name("shipping.street2"));
			Thread.sleep(2000);
			shreetadreestwo.sendKeys("lwvesville");
			WebElement city = driver.findElement(By.name("shipping.city"));
			Thread.sleep(2000);
			city.sendKeys("texas");
			WebElement zipCode = driver.findElement(By.name("shipping.zip"));
			Thread.sleep(2000);
			zipCode.sendKeys("12345");
			/*WebElement dropdown = driver.findElement(By.xpath("//select[@name='shipping.country']"));
			Thread.sleep(2000);
			Select s=new Select( dropdown);
			Thread.sleep(2000);
			s.deselectByVisibleText("Brazil");*/
			driver.findElement(By.name("shipping-option")).click();
			WebElement credit_card = driver.findElement(By.xpath("//input[@value='/var/commerce/payment-methods/we-retail/creditcard']"));
			credit_card.click();
			WebElement card_number = driver.findElement(By.name("card.number"));
			Thread.sleep(2000);
			card_number.sendKeys("1234566789");
			Thread.sleep(2000);
			driver.findElement(By.name("card.expiration.date")).sendKeys("23/06/2028");
			Thread.sleep(2000);
			driver.findElement(By.name("card.security.code")).sendKeys("990");
			Thread.sleep(2000);
			driver.findElement(By.name("promotional-code")).sendKeys("123455");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='cmp-form-button']")).submit();
			driver.findElement(By.xpath("//button[@type='SUBMIT']")).submit();
			driver.findElement(By.xpath("//a[text()='Back to Luma']")).click();
	}

}

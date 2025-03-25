package seleniumSessionRei;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class WaitsTypes4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//setting implicit wait for 10 sec
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //selenium3   -- 1
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium4
		driver.get("https://www.geeksforgeeks.org/selenium-waits/");  
		driver.manage().window().fullscreen();
		//Explicit wait 2
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Sign In']"));
//		ele.click();
//		driver.findElement(By.id("luser")).sendKeys("test23@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("23sde34332");
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement el =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));
//        el.click();
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Sign In']"));
		ele.click();
		//fluent wait
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(52))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement element = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));
		element.click();
		driver.quit();
	}

}

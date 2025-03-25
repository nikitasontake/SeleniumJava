package seleniumSessionRei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.lang%3Den-IN");
		//1. id - is a unique l (I)
//		WebElement element =   driver.findElement(By.id("login-username"));
//		element.sendKeys("test@yahoo.com");
//		WebElement nextBtn = driver.findElement(By.id("login-signin"));
//		nextBtn.click();
		
//		driver.findElement(By.id("login-username")).sendKeys("nikitasontakke43@yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("login-signin")).click();
//		Thread.sleep(4000);
		//2. name -is a unique L(I)
//		driver.findElement(By.name("username")).sendKeys("nikitasontakke43@yahoo.com");
//		driver.findElement(By.name("signin")).click();
		
		//3. xpath (extended html path) (II)
//		driver.findElement(By.xpath("//input[@id=\'login-username\']")).sendKeys("test@yahool.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();
//		Thread.sleep(4000);
		
		//4. cssSelector (II)
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("test34@yahoo.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#login-signin")).click();
//		Thread.sleep(2000);
		
		//5. linkText only for links (sometimes id is not available then we can go with linkText) (IV)
//		driver.findElement(By.linkText("Forgotten username?")).click();
//		driver.findElement(By.linkText("Create an account")).click();
		
		//6. partialLinkText (only for links but not recommended) (V)
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//7. class name - is not unique -- IV
		Thread.sleep(2000);
		driver.findElement(By.className("phone-no field-error")).sendKeys("test@yahoo.com");
		Thread.sleep(3000);
		
		//8. tagName
		driver.quit();

	}

}

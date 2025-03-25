package seleniumSessionRei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        String gettext = driver.findElement(By.xpath("//div[text()='Log in']")).getText();
        System.out.println("Text = "+gettext);
        
        String attribute = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).getAttribute("name");
        System.out.println("Attribute ="+attribute);
        
        WebElement e1 =   driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        e1.sendKeys("123456784");
        e1.clear();
        
        System.out.println(driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).isDisplayed());
        System.out.println();//isSelected isEnabled
        
	}

}

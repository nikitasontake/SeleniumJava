package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fglobaldeals%3F_trkparms%3Dpageci%253A76320a2a-0424-11f0-9bae-42c52d338f32%257Cparentrq%253Aaa7464d11950a6255fb11157ffffffb6%257Ciid%253A1%257Cvlpname%253Avlp_homepage");
        //1.xPath 2.id--1 3.name --3 4.linkText 5.partialLinkText 6.cssSelector(if id is there#{id}, if class .{class} )--2 7.class name -not useful --4
        driver.findElement(By.xpath("//*[@id=\"personalaccount-radio\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Niki");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Son");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("abc34@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("NIKI@123");
        driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
	}

}

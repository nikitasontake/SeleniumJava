package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tajhotels.com/en-in/epicureprogram?gad_source=1");
		driver.findElement(By.xpath("//*[@id=\"main__Header_nav\"]/div/div[2]/div[2]/div[2]/button")).click();
//		driver.findElement(By.id("businessName")).sendKeys("REI");
//		driver.findElement(By.xpath("//*[@id=\"businessCountry\"]")).click();
//		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.className("MuiTypography-root MuiTypography-body-ml css-1l5jdh")));
		select.selectByVisibleText("None");
		Thread.sleep(2000);
		driver.quit();

	}

}

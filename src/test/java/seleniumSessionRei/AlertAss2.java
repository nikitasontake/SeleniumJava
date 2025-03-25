package seleniumSessionRei;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAss2 {

	public static void main(String[] args) {

		//		Alerts
		//		1)Initiate review process-Send Review form for approval to Approver(Pre-screen review/SME Review/Management Review)-Login as form Review Approver-Fill up form-Click on Submit button -Write code for all alert methods.

		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com");
		  
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
		
		// ----------- simple alert (ok) --------------
		
//		driver.findElement(By.xpath("//div[@class='row']//div[@class='col-12 mt-4 col-md-6']//div[@id='javascriptAlertsWrapper']//div[@class='col']//button[@id='alertButton']")).click();	
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert Message = "+alert.getText());
//        alert.accept();
        
        //-------- Confirmation ALert (ok and cancel ) ---------
//        driver.findElement(By.xpath("//div[@class='col']//button[@id='confirmButton']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println("Confirmation Alert Message = "+alert.getText());
//        alert.accept();
        
        //for dismiss
//        Alert alert = driver.switchTo().alert();
//        System.out.println("Confirmation Alert Message = "+alert.getText());
//        alert.dismiss();
        
        // ------------ Prompt Alert (input , ok And cancel) ------------
        driver.findElement(By.xpath("//div[@class='col']//button[@id='promtButton']")).click();
        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("Nikita");
        System.out.println("Prompt Alert Message = "+alert.getText());
//        alert.accept();
        //for dismiss
        alert.dismiss();
        
//        driver.quit();
	}

}

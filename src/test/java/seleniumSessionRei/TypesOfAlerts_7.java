package seleniumSessionRei;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfAlerts_7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://test8-internal--qaorg.sandbox.lightning.force.com/lightning/r/Announcement__c/a1b75000000xOhdAAE/view");
		driver.findElement(By.id("username")).sendKeys("sarah.pm@ggp.test8.qaorg");
		driver.findElement(By.id("password")).sendKeys("Rei@2025");
		driver.findElement(By.id("Login")).click();
//        driver.findElement(By.xpath("//ul[@class='slds-tabs_default__nav']//li[@title='Overview']")).click();

		//System.out.println("===========================================");
		driver.findElement(By.xpath("//div[@class='slds-is-relative']//div[@class='slds-col slds-size_5-of-12 flexEnd']//lightning-button[@class='slds-button slds-m-top_xxx-small']//button[text()='Associate']")).click();
		//System.out.println("===========================/////////================");
		
		
		//Simple Alert (ok)
//		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']/following::button[text()='Associate' or value='[object Object]']")).click();
		//click the button to trigger the alert
		//switch to alert
//		Alert alert = driver.switchTo().alert();
		// -- accept alert --
		//driver.findElement(By.id(null)).click();
		//driver.switchTo().alert().accept();
		
		// -- dismiss alert --
		//driver.findElement(By.id(null)).click(); 
		//driver.switchTO().alert().dismiss(); //click cancel
		
		// -- get alert text --
		// Click a button to trigger an alert
//		driver.findElement(By.id("alertButton")).click();
//		// Switch to alert and get the text
//		String message = driver.switchTo().alert().getText();
//		System.out.println("Alert Message: " + message);
 
		
		//--sent text to alert(Prompt alert --
		// Click a button to trigger a prompt alert
//		driver.findElement(By.id("promptButton")).click();
//		// Switch to alert
//		Alert alert = driver.switchTo().alert();
//		// Enter text in the prompt
//		alert.sendKeys("Selenium Automation");
//		// Accept the alert
//		alert.accept();

		// Accept the alert
//		driver.switchTo().alert().accept();

		
		//get alert text
//		System.out.println("Alert Message "+alert.getText());
		//accept the alert (click ok)
//        alert.accept();
        
      //Confirmation Alert (ok & cancel)
//        driver.findElement(By.xpath("")).click();
//        Alert a = driver.switchTo().alert();
        
//        System.out.println("Confirmation Alert "+a.getText());
//        a.accept();
        
        //Prompt Alert (Text Input + ok/cancel)
//        driver.findElement(By.xpath("")).click();
//        Alert al = driver.switchTo().alert();
        
//        System.out.println("prompt Alert "+al.getText());
//        al.sendKeys("Test data");
//        al.accept();
          driver.quit();
        
	}

}

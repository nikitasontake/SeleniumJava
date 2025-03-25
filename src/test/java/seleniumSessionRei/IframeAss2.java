package seleniumSessionRei;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAss2 {

	public static void main(String[] args) throws InterruptedException {

		//		Iframe: 
		//		1)Login as Internal user-Navigate to announcement tab-Navigate to published announcement table-Click on top right button New-Use Iframe concept write code for switching to modal window.
       
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/PhaseView?t=FundingOpportunity");
        driver.findElement(By.id("username")).sendKeys("krishnacr7@reisystems.in.ktorgn");
    	driver.findElement(By.id("password")).sendKeys("Password@12345");
    	driver.findElement(By.id("Login")).click();
    	driver.findElement(By.xpath("//span[@class='ng-scope']//button[@class='secondaryBtn ng-scope ng-binding']")).click();

    	driver.switchTo().frame("ActiveFundingOpportunitiesAlliframeContentId");
        driver.findElement(By.xpath("//input[@class='508Input ']")).sendKeys("Ann Test");
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:ModalTemplateId:j_id104:j_id105:componentForm:j_id190:0:j_id191:j_id193:j_id194:j_id210:0:j_id637:3:testxyz\"]")));
        se.selectByVisibleText("Construction");
        driver.findElement(By.xpath("//*[@id=\"j_id0:ModalTemplateId:j_id104:j_id105:componentForm:j_id190:0:j_id191:j_id193:j_id194:j_id210:0:j_id637:2:j_id725\"]")).sendKeys("PG-T09-0126");
        driver.findElement(By.id("j_id0:ModalTemplateId:j_id104:j_id105:componentForm:j_id1087")).click();
	}

}

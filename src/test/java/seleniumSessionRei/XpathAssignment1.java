package seleniumSessionRei;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		/*1)Internal program should be in created state-Then Edit and Submit for approval button is visible--
	      a)Findout xpath for Edit and Submit for Approval button.
          b)Findout xpath for only Edit button.
          ==> //div[@class='slds-float_right']//button[@title='Edit']
          ==>//div[@class='slds-float_right']//button[@title='Edit' or @title='Submit For Approval']
          
          2)Internal program should be in created state-overview subtab-contacts table
          1)Findout xpath for New top right button of contacts table
          ==>//div[@class='slds-float_right btn-wrapper']//button[@title='New']

          3)Internal program should be in created state-overview subtab-contacts table--Associate one contact by clicking on associate button.
          1)Findout xpath for Edit/View/Remove action icon of associate contact.
          ==> //div[@class='slds-dropdown__item']//a
          ==>//div[@class='slds-is-relative']//lightning-menu-item[@role='presentation']

          4)Announcement should be in Created state   //AN-65546-341 
          1.Findout xpath for headers fields(EGMS ID, status, application due date )
          ==>//div[@data-id='a0t4T000000YPiEQAW']//div[@class='slds-p-bottom_small slds-p-horizontal_small slds-col slds-size_1-of-4']
          
          5.Announcement should be in Created state.
          1.findout xpath for Financial subtab.
          ==> //ul[@class='slds-tabs_default__nav']//li[2][@title='Financials']

          6)Announcement should be in Created state-click on Edit top right button-overview subtab-Information section
          1.findout xpath for entering value into Announcement Name field.
          ==> //label[text()='Announcement Name']/following-sibling::div/input

           7)Announcement should be in Created state-Click on Hamburger option
          1.findout xpath for Take Snapshot link option.
          ==> //div[@class='slds-dropdown__item']//a[@href='javascript:void(0)']//span[text()='Take Snapshot']
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test8-internal--qaorg.sandbox.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sarah.pm@ggp.test8.qaorg");
		driver.findElement(By.id("password")).sendKeys("Rei@2025");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		driver.quit();
	}

}

package seleniumSessionRei;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAss2 {

	public static void main(String[] args) throws InterruptedException {

		// Window handling
		// 1)Login as Internal user- Navigate to announcement record-Navigate to overview subtab-navigate to program ID field under Information section-Click on program id hyperlink--Use Window handling Concept, user should navigate to new tab(on program layout).

		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/AnnouncementView?id=a1bDj000001QLEdIAO&RefreshBehaviour=null&TableName=ActiveFundingOpportunitiesAll&TableType=flextable&retURL=%2Fapex%2Fc__PhaseView%3Ft%3DFundingOpportunity");
		driver.findElement(By.id("username")).sendKeys("krishnacr7@reisystems.in.ktorgn");
		driver.findElement(By.id("password")).sendKeys("Password@12345");
		driver.findElement(By.id("Login")).click();
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main Window ID = "+mainWindowHandle);
		
		driver.findElement(By.xpath("//dd//span[@id='program__ca0u7A000005Z9RPQA0']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//dd//span[@id='program__ca0u7A000005Z9RPQA0']")));
		ele.click();
		
		Set<String> nwinHandle= driver.getWindowHandles();
		
		for(String window : nwinHandle) {
			if(!window.equals(mainWindowHandle)) {
				driver.switchTo().window(window);
				System.out.println("Switched to New Window : "+window);
				Thread.sleep(2000);
				System.out.println("New Window Title = "+driver.getTitle());
				break;
			}
		}
		driver.switchTo().window(mainWindowHandle);
		System.out.println("Switched Back to main Window = "+driver.getTitle());
		driver.quit();

	}

}

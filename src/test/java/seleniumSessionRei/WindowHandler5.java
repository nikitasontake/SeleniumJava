package seleniumSessionRei;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandler5 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.geeksforgeeks.org/selenium-waits/");
//		//store the main window handle
//        String mainWindowHandle = driver.getWindowHandle();
//        System.out.println("Main Window ID "+mainWindowHandle);
     
        //click a button that opens a new Window
//       driver.findElement(By.xpath("//ul[@id='hslider']//following::a[text()='Webscraping']")).click();
       
        //get all open window handle
//       Set<String> allWindows = driver.getWindowHandles();
        
//        for(String wHandle : allWindows) {
//        	if(!wHandle.equals(mainWindowHandle)) {
//        		driver.switchTo().window(wHandle);
//        		 System.out.println(driver.getTitle());
//        		 driver.close();
//        		System.out.println("Switched to New Window "+wHandle);
//        		break;
//        	}
//        }
//        driver.switchTo().window(mainWindowHandle);
//        System.out.println("Switched Back to Main Window "+driver.getTitle());
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test8-internal--ktorgn--c.sandbox.vf.force.com/apex/AnnouncementView?id=a1bDj000001QLEdIAO&RefreshBehaviour=null&TableName=ActiveFundingOpportunitiesAll&TableType=flextable&retURL=%2Fapex%2Fc__PhaseView%3Ft%3DFundingOpportunity");
		driver.findElement(By.id("username")).sendKeys("krishnacr7@reisystems.in.ktorgn");
		driver.findElement(By.id("password")).sendKeys("Password@12345");
		driver.findElement(By.id("Login")).click();
		
		String mainW = driver.getWindowHandle();
		System.out.println("Main Window ID "+mainW);
		
		driver.findElement(By.xpath("//dd//span[@id='program__ca0u7A000005Z9RPQA0']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//dd//span[@id='program__ca0u7A000005Z9RPQA0']")));
        ele.click();
        
       Set<String> winAll = driver.getWindowHandles();
       
       for(String win : winAll) {
    	   if(! win.equals(mainW)) {
    		   driver.switchTo().window(win);
    		   System.out.println("Next WIndow ID "+win);
    		   Thread.sleep(2000);
    		   System.out.println("Window Title "+driver.getTitle());
    		   break;
    	   }
       }
       driver.switchTo().window(mainW);
       System.out.println("Main WIndow T "+driver.getTitle());
       driver.quit();
	}

}

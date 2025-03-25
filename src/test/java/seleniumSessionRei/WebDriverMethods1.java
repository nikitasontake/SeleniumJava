package seleniumSessionRei;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Browser Control Methods 
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		Thread.sleep(2000);
	
		//        driver.navigate().back();
		//        Thread.sleep(2000);
		//        driver.manage().window().fullscreen();
		//        Thread.sleep(2000);
		//      driver.navigate().forward();
		//      driver.navigate().refresh();
		//      driver.navigate().to("https://www.google.com/"); //another way to refresh
		driver.close();

		//        driver.quit();

	}

}

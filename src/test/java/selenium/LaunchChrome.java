package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Trainee\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//validation point
		if(driver.getTitle().equalsIgnoreCase("google")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
		}
		Thread.sleep(3000);
        driver.quit();
	}

}

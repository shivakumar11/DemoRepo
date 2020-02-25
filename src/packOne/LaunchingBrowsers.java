package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchingBrowsers {
	@Test
	public void launchedBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		Assert.fail("failing Intensionally");
		driver.close();
	}


	
//	public static void main(String[] args) {
//
//		LaunchingBrowsers obj = new LaunchingBrowsers();
//		obj.launchedBrowser();
//		
//	}

}

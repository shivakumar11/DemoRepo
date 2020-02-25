package packOne;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll {
	WebDriver driver = new ChromeDriver();

	void FaceBook() {

		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,150)");
		jse.executeScript("scrollBy(0,-150)");
		jse.executeScript("scrollBy(150,0)");
		jse.executeScript("scrollBy(-150,0)");

	}

	public static void main(String[] args) {
		HandlingScroll obj = new HandlingScroll();
		obj.FaceBook();
	}

}

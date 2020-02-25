package packOne;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	void Guru99() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[text()=' http://toolsqa.com/automation-practice-switch-windows/']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		handles.remove(parent);
		
//		for(String h: handles) {
//			
//			System.out.println(h);
//		}
//		
		String child=handles.iterator().next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
     
		WindowHandles obj=new WindowHandles();
		obj.Guru99();
	}

}

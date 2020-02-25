package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	
	void chromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
	
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		NavigationCommands obj=new NavigationCommands();
		
		obj.chromeBrowser();
		
	}

}

package packOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
	
	
	
	void facebookLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Username=driver.findElement(By.name("email"));
		
		Username.clear();
		Username.click();
		Username.sendKeys("Shivatvbjbc");
		//System.out.println(Username.getAttribute("value"));
		System.out.println(Username.getText());
		driver.close();
	}

	public static void main(String[] args) {
		LocatingWebElements obj=new LocatingWebElements();
		obj.facebookLaunch();
	}

}

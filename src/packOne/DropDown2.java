package packOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	void selectByVisibleText(WebElement ele, String text) {

		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	void selectByIndex(WebElement ele,int index) {
		Select select = new Select(ele);
	    select.selectByIndex(index);
	}
	
	void selectByValue(WebElement ele,String value) {
		Select select=new Select(ele);
		select.selectByValue(value);
		
	}
	void facebook() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\xvsdg\\\\DemoSelenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		
		WebElement day=driver.findElement(By.id("day"));
		selectByIndex(day, 25);
		
		WebElement month=driver.findElement(By.id("month"));
		selectByVisibleText(month, "Aug");
		
		WebElement year=driver.findElement(By.id("year"));
		selectByValue(year, "1992");
		
	}

	public static void main(String[] args) {
		DropDown2 obj = new DropDown2();
		obj.facebook();

	}

}

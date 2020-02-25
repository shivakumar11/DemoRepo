package packOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	void facebook() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\xvsdg\\\\DemoSelenium\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);

		Select select1 = new Select(month);
		Select select2 = new Select(year);
		select.selectByIndex(20);
		select1.selectByValue("3");
		select2.selectByVisibleText("2015");

	}

	public static void main(String[] args) {
		DropDown obj = new DropDown();
		obj.facebook();

	}

}

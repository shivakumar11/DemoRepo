package packOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	WebDriver driver;

	void ImplicitlyWait(long time, TimeUnit timeunit) {

		driver.manage().timeouts().implicitlyWait(time, timeunit);
	}
	void ExplicitlyWait() {
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	void Faceook() {

		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		ImplicitlyWait(5, TimeUnit.SECONDS);
		WebElement wb = driver.findElement(By.xpath(" //td[@class=\"html7magic\"]/label"));

		System.out.println(wb.getText());

		if (wb.getText().equals("Email or phone")) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

		driver.close();
	}

	public static void main(String[] args) {

		Waits obj = new Waits();
		obj.Faceook();
	}

}

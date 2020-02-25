package packOne;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWithTable {

	void ToolsQA() {

		System.setProperty("webdriver.chrome.driver", "D:\\xvsdg\\DemoSelenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-table/#");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		WebElement str=driver.findElement(By.xpath("//h1[@class=\"entry-title\"]"));
//		
//		System.out.println(str.getText());
//		
//		if(str.getText().equals("Automation practice table")) {
//			System.out.println("text is present ");
//		}else {
//			System.out.println("text is not present");
//	
//		}

		List<WebElement> thlist = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));

		for (int th = 1; th <= thlist.size(); th++) {
			String str = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th[" + th + "]"))
					.getText();
			System.out.println(str);
		}

		List<WebElement> trlist = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));

		for (int row = 1; row <= trlist.size(); row++) {

			String Str1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + row + "]/td")).getText();

			System.out.println(Str1);

		}

		driver.close();
	}

	public static void main(String[] args) {
		HandleWithTable obj = new HandleWithTable();
		obj.ToolsQA();
	}

}

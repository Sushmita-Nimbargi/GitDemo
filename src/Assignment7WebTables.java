import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//cast the driver to javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> tableValues = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		
		//counting the number of rows
		System.out.println(tableValues.size());
		
		//counting the number of columns
		
		List<WebElement> tableColumns = driver.findElements(By.cssSelector("table[name='courses'] tr th"));
		System.out.println(tableColumns.size());
		
		
		//printing the values in second row
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
				

	}

}

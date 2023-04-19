import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//url:https://the-internet.herokuapp.com/windows
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		//When we click on multiple windows ,opening new window page opens in same tab so thats why we can access both here
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		//when we click on click here, new window opens thats why use getWindowHandles() to get all window id's
		Set<String>windows = driver.getWindowHandles();
		
		Iterator<String>it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());

	}

}

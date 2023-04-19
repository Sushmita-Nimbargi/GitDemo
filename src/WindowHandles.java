import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//video:88 Window handle concepts
		//moving from one window to another window
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//to check how many widows are open use windowHandles()
		//WindowHandles() gives id's of all the windows opened by automation
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
		
		Iterator<String>it = windows.iterator(); //extracts the values
		
		String parentId = it.next(); //returns 0th index i.e. parentid
		String childId = it.next(); //returns 1st index i.e. childid
		
		driver.switchTo().window(childId); //provide id of window which we need to pass
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		//add the debugger point and debug as java application then select the below line and right click and select watch then there add expression 
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId+" - EmailID");
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys(emailId);
	}

}

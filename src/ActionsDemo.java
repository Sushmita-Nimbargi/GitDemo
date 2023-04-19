import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//video:86 Handling ajax or mouse interactions
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//Defining Actions
		
		Actions a = new Actions(driver);
		
		//build()-->ready to execute
		//perfom() --> executes the step
		//Composite actions
		//In search button search Hello with capital letters and select the whole content
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//moveToElement is for hovering on the element
		WebElement move= driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		
		
	}

}

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign8AutosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    //   //input[@id='autocomplete']
	    //  //li[@class='ui-menu-item']/div
	    
	    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
	    
	    
	    WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ui-menu-item']/div")));
	  
	    
	    List<WebElement> values = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
	    
	    for(int i=0;i<values.size();i++) {
	    	
	    	if(values.get(i).getText().equalsIgnoreCase("India")) {
	    		Actions a = new Actions(driver);
	    		values.get(i).click();
	    		//a.moveToElement(values.get(i)).click();
	    		break;
	    	}
	    }
	    

	}

}

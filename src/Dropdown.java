 import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// video55: Handling dynamic dropdown with webdriver API
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 //System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPrograms\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		// WebDriver driver= new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value='MAA']--> xpath for Chennai
		// //a[@value='BLR']---> xpath for bangalore
		
		// travelling from bangalore to chennai
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();  // first click the first dropdown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//both from and to dropdowns have same values to distinguish to select from second dropdown we have to give index otherwise we get ElementNotVisibleException
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //here we have to give index so that it should select Chennai from second dropdown

		//video:56 Parent child relationship locator to identify the objects uniquely
		
		//  //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']
		
		//instead of using index in line number 26 we have to write below using parent child relationship locator
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		//Video:63 Handling calender UI in travel website using selenium
		// When we use CSS selector with class name there should not be spaces between the classes therefore replace the classes with dot
		
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		
		//xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		
		
		
	}

}

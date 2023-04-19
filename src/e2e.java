import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video:66 End to end automation using all UI elements with Selenium
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    
	    //from city to  To city
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();  // first click the first dropdown
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Selecting depart date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//Checking whether return date is disabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
		{
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//Selecting passengers field
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); //clicking 3 times
		} 
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Clicking checkbox
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		//clicking search button
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		driver.close();

	}

}

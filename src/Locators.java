import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {


		//chromedriver.exe--> chromebrowser-->invoke chrome browser
				//In the latest version of selenium(4.6.0) System.set property is optional instead they have Selenium Manager
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//this line wait for 5 seconds if anything not showed up
				//implicit wait is added when any object is not showing on screen 
				//for example error message if we enter wrong passoword
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("heloo123");
				driver.findElement(By.className("signInBtn")).click();
				
				//to display the error text in console
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // for this it will show 
				//error so we have to add implicitylywait
				
				//link text locator
				driver.findElement(By.linkText("Forgot your password?")).click();
				 
				Thread.sleep(1000);//1000 in milli seconds which means it waits for one second
				//script will wait for one second before it is moving to next view
				//To avoid Elementclickinterceptedexception we will provide 1 second delay while moving from one page to another page
				// While traversing from one page to another page it will wait for one second so that page gets stable
				
				
				
				//Xpath locator
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
				
				//Customised xpath and css selector based on html attributes
				
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
				driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
				driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
				
				//Generating xpaths with parent to child tags traverse techniques
				//traversing from parent to child
				//if there are no attributes
				driver.findElement(By.xpath("//form/input[3]")).sendKeys("89843734334"); //parent to child using tagnames
				//driver.findElement(By.className("reset-pwd-btn")).click();
				driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
				System.out.println(driver.findElement(By.cssSelector("form p")).getText());
				
				
				//VIDEO-40  Generating css selectors based on regular expressions
				
				//Generating css selectors based on regular expressions
				
				//parent to child using attributes
				driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
				//after clicking on go to login button again the view changes so we have wait for a second so that page gets stable
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
				//Generating css selectors based on regular expressions
				driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//regular expression for css selector
				driver.findElement(By.id("chkboxOne")).click();//clicking the check box
				// for xpath when we are selecting by class we have to give full class name --> //button[@class='submit signInBtn']
				//regular expression for xpath
				driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
				
				
				//video--42 Identifying web elements based on unique tag name locators
				
				
				
				
				
				
				

	}
	

}

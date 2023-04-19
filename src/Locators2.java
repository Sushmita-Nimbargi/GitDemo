import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
	     
		String name="rahul";
		
		//chromedriver.exe--> chromebrowser-->invoke chrome browser
		//In the latest version of selenium(4.6.0) System.set property is optional instead they have Selenium Manager
		
		//below two lines are for running in chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver= new ChromeDriver();
		
		//below two lines are for running in firefox browser
		//System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPrograms\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//this line wait for 5 seconds if anything not showed up
		//implicit wait is added when any object is not showing on screen 
		//for example error message if we enter wrong passoword
		
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		// tagname locator
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assertion
		//Comparing actual result and expected result using assertion
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		//video 43: Identifying elements based on text
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); //clicking log out button
		//here instead of star (*) we can write tagname also
		
		driver.close();
		

	}
	
	// video 44 ---> calling the method to extract password from text and dynamically sending in sendkeys()
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray = passwordText.split("'");
		//passwordArray//0th index--->Please use temporary password
		//passwordArray//1st index--->rahulshettyacademy' to Login.
	 //	String[] passwordArray2 =  passwordArray[1].split("'");
	//	passwordArray2[0]
		
		//passwordArray[1]//0th index--->rahulshettyacademy
		//passwordArray[1]//1st index---> to Login.
		
		String password = passwordArray[1].split("'")[0];
		return password;
		
		
}
}

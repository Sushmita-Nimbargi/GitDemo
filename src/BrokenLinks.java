

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//Video 111:Open connection method to identify status codes of the link
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    //Broken URL
	  //step-1: is to get all the url's tied up to the links using selenium
	  //Java methods will call URL's and get you the status code
	  //if status code>400 then that url is not working -->Link which tied to that url is broken
	   
	    // this code is for single link
	   String url1 = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	   
	   HttpURLConnection conn = (HttpURLConnection)new URL(url1).openConnection();
	   conn.setRequestMethod("HEAD");
	  int responseCode1 =  conn.getResponseCode();
	  System.out.println(responseCode1);
	  
	  //Video:112 Iterating over all the links in the page to validate broken links mechanism
	  
	List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	
	//Soft assertions
	SoftAssert a = new SoftAssert();
	
	for(WebElement link:links) {
		
		String url = link.getAttribute("href");
		 HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		 connection.setRequestMethod("HEAD");
		  int responseCode =  connection.getResponseCode();
		  System.out.println(responseCode);
		  //instead of if condition we use soft assertions so that it should not stop execution after first failure
		  //With the help of soft assertions we can continue the code execution even we found false condition at the end we can list all the failure conditions
		  
		  a.assertTrue(responseCode<400, "The link with linktext"+" "+link.getText()+" " +"is broken with code"+responseCode);
		  
			/*
			 * if(responseCode>400) {
			 * System.out.println("The link with text"+" "+link.getText()+" "
			 * +"is broken with code"+responseCode); Assert.assertTrue(false); }
			 */
	}
	
	//It will catch all the failures and list them at the end
       a.assertAll();
	}

}

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//give me the count of links on the page
		//video 93: print the links count in the page
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    
	    //get the count of links only from footer section:This we acheive by limiting the scope of webdriver
	    
	    WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
	    
	    System.out.println(footerDriver.findElements(By.tagName("a")).size());
	    
	    
	    //get the count of links from first column
	    
	    WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    
	    System.out.println(columnDriver.findElements(By.tagName("a")).size());
	    
	    //click on each link on the first column and how to open the links in the Separate tabs - optimized solution
	    
	    for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
	    	
	    	//if you want to open links in new tab hold ctrl and press Enter  on the link it will open in new tab
	    	
	    	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	//columnDriver.findElements(By.tagName("a")).get(i).click();
	    	columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	    	Thread.sleep(5000);
	    }
	    //video 95:Getting the titles of child tabs with optimized while loop
	    Set<String> abc = driver.getWindowHandles();//4 windows
	    Iterator<String> it = abc.iterator();
	    
	    //difference between hasNext() and Next()
	    //hasNext() checks whether there is a next window present or not
	    //Next() moves to the new window or opens the new window
	    
	    while(it.hasNext()) {
	    	Thread.sleep(5000);
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	    
		

	}

}

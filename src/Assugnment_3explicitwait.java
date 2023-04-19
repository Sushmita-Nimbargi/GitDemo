import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assugnment_3explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	   	WebDriver driver= new ChromeDriver();
	   	driver.manage().window().maximize();
	   	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	   	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
	   	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
	   	
	   	driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	   	driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
	   	//clicking on radio button--->if there are two elements with same classes then select them by using index
	   	//(//label[@class='customradio']) [2]
	   	// //div[@class='form-check-inline']//label[2]
	   	
	   	driver.findElement(By.xpath("(//label[@class='customradio']) [2]")).click();
	   	//for clicking pop up or modal button add explicit wait so that it should load the element to locate
	   	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	   	
	   	driver.findElement(By.id("okayBtn")).click();
	   	
	   	// static dropdown
	   	
	  WebElement d = driver.findElement(By.xpath("//select[@class='form-control']"));
	   	Select dropdown = new Select(d);
	   	
	   	dropdown.selectByValue("consult");
	   	
	   	//Selecting checkbox
	   	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	   	
	   	//Adding explicit wait before clicking sign In
	   	
	   	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn"))).click();
	   	
	   	//button[class='btn btn-info']
	   //	Thread.sleep(3000);
	   	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class='btn btn-info']")));
	   List<WebElement>	items = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
	  for(int i=0;i<items.size();i++) {
		  
		  items.get(i).click();
		  
	  }
	  
	  driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	   	
	   	
	   	
	   	
	   	

	}

}

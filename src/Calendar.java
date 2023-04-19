import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 98:selecting date on calendar
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize(); //browser will open in maximised mode
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://www.path2usa.com/travel-companion/");
	   	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		
		//click on April 23
		
		//clicking on calendar
	
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Date of travel']")));
	   
	     String clickonlinkTab=Keys.chord(Keys.ENTER);
	     
	     //.clik() method was not working that's why we used keyboard keys to click on the date field
	     driver.findElement(By.cssSelector("input[placeholder='Date of travel']")).sendKeys(clickonlinkTab);
	     
	     
	     //selecting the month
	     
	     String selectedMonth = driver.findElement(By.cssSelector("[class='flatpickr-current-month'] [class='cur-month']")).getText();

	     //while(true){
	     //}
	     // above while loop executes until the condition becomes false viceversa if we put false condition, loop will execute until condition becomes true
	    while( !selectedMonth.contains("April")) {
	    	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='flatpickr-month'] span[class='flatpickr-next-month']")));
	    	driver.findElement(By.cssSelector("div[class='flatpickr-month'] span[class='flatpickr-next-month']")).click();
	    }
	     
	     
		
		//selecting all the days
	     //grab the common attribute//put it into list and iterate
		
		List<WebElement>dates = driver.findElements(By.className("flatpickr-day"));
		
		int count = driver.findElements(By.cssSelector(".flatpickr-day")).size();
		
		for(int i=0;i<dates.size();i++) {
			
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				dates.get(i).sendKeys(clickonlinkTab);
				break;
			}
		}

	}

}

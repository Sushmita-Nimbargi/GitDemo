import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //video 121: Filter the webtable using Selenium Java Streams
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    //search with rice in table
	    
	    driver.findElement(By.id("search-field")).sendKeys("Rice");
	    
	    //get the list of veggies
	    
	   List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
	   
	   List<WebElement> filterdList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
	   
	   Assert.assertEquals(veggies.size(), filterdList.size());
		
		
	}

}

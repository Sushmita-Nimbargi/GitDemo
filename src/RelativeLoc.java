import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//video:123 Introduction to relative locators
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    
	    WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
	    
	    System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
	    
	    
	    //Find the element which is below of date of birth
	    //Relative locators wont support flex elements so it will select submit button which is below date of birth filed
	    
	   // WebElement dateofBirth =  driver.findElement(By.cssSelector("[name='bday']"));
	  //  driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
	    
	    
	    
	    //tick the checkbox which is to the left of label"Check me out if you love labels"
	    WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
	    
	    
	    //find the label of first employee status radio button
	    
	    WebElement rdb = driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
	    
	    
		
	}

}

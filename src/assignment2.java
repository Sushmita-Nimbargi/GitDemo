import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//url:https://rahulshettyacademy.com/angularpractice/
		//Assignment 2`;UI,Dropdown,edit boxes
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    
	    driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Sushmita");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("n22sushmitanimbargi@gmail.com");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mita@8050");
	    driver.findElement(By.id("exampleCheck1")).click();
	    //static dropdown
	    
	    WebElement Selecteddropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select dropdown = new Select(Selecteddropdown);
	    dropdown.selectByVisibleText("Female");
	    
	    //Radio button
	    driver.findElement(By.cssSelector("#inlineRadio1")).click();
	    
	    //calender bday
	    driver.findElement(By.name("bday")).sendKeys("06221995");
	    
	    //submit button
	    driver.findElement(By.cssSelector("input[value='Submit']")).click();
	   System.out.println( driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}

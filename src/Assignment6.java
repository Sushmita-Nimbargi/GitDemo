import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    
	    driver.findElement(By.id("checkBoxOption2")).click();
	   
	    System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
	    
	    String checkBoxText = driver.findElement(By.cssSelector("label[for='benz']")).getText();
	    
	   WebElement dropdown =  driver.findElement(By.id("dropdown-class-example"));
	    Select selectedDropdown = new Select(dropdown);
	    
	   // dropdown.sendKeys(checkBoxText);
	    selectedDropdown.selectByVisibleText(checkBoxText);
	    
	    driver.findElement(By.id("name")).sendKeys(checkBoxText);
	    driver.findElement(By.id("alertbtn")).click();
	   // driver.switchTo().alert().accept();
	    String text = driver.switchTo().alert().getText();
	    
	    if(text.contains(checkBoxText)) {
	    	System.out.println("Alert message success");
	    }
	    else {
	    	System.out.println("Something wrong with execution");
	    }
	    
	    driver.switchTo().alert().accept();
	    
	    
		

	}

}

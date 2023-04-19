import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//video 47:Identifying locators with siblings
		
		//parent to child traverse 
				//select the button after practice button
				
				//below two lines are for running in chrome browser
						System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
					   	WebDriver driver= new ChromeDriver();
					   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
					    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
					    
					    
		//video 48: Traverse from chilld to parent element with xpath -->This is not possible in css selector
					    
					 //   //header/div/button[1]/parent::div/button[2]
					 //upto parent div its child to parent from there button[2] is again parent to child
					   System.out.println( driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());


	}

}

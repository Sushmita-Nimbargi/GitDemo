import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Video:53 Updated lecture on latest dropdowm
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize(); //browser will open in maximised mode
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				//video:60 handling checkbox and getting the size of them with Selenium
				
				Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
				//instead of sysout we can use assertions
			//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
				
				Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			 //  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			   
			   //Count the number of checkboxes
			   System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
				
			   //Video 64:Validating if UI Elements are disabled or enabled with attributes
			   
			   //to check whether return date is enabled or not
			   //isEnabled() is not wokig properly so we are using another approach
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			 //   System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			   driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			   
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("is Enabled");
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
			   
				
				
				
			   
			   
				
				//selecting passengers field
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				
				//add 4 adults -->clicking + icon 4 times
				/* int i=1;
				while(i<5) {
					driver.findElement(By.id("hrefIncAdt")).click(); //clicking 4 times
					i++;
				} */
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				for(int i=1;i<5;i++) {
					driver.findElement(By.id("hrefIncAdt")).click(); //clicking 4 times
				} 
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}

}

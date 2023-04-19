import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// video 68:handling java alerts using selenium web driver
		String text = "Rahul";
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// If you want to click on ok or yes like positive response then use accept();
		driver.switchTo().alert().accept();

		// clicking on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		// if you click on negative response like no or cancel button in alerts use
		// dismiss()
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
        
		
	}

}

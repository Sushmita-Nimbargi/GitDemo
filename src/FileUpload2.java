import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FileUpload2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 //below two lines of code we have to add for ChromeDriver(chrome browser version) executor version above 111
			ChromeOptions options = new ChromeOptions();
			//FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
			//System.setProperty("webdriver.edge.driver", "D:\\SeleniumPrograms\\edgedriver_win64\\msedgedriver.exe");
			//WebDriver driver= new EdgeDriver();
			//System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPrograms\\geckodriver-v0.33.0-win32\\geckodriver.exe");
			//WebDriver driver= new FirefoxDriver(options);
		    driver.manage().window().maximize();
		   driver.get("https://demo.automationtesting.in/Register.html");
		
		
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);

	}

}

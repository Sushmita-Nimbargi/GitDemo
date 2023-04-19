import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Invoking the browser
		//Chrome--ChromeDriver-->methods
		//Firefox --FirefoxDriver-->methods
		//safari--SafariDriver-->methods
		//webdriver methods+ class methods
		//ChromeDriver driver = new ChromeDriver();
		
		//chromedriver.exe--> chromebrowser-->invoke chrome browser
		//In the latest version of selenium(4.6.0) System.set property is optional instead they have Selenium Manager
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Firefox launch
		//geckodriver--webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPrograms\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		
		//MicrosoftEdge launch
		System.setProperty("webdriver.edge.driver", "D:\\SeleniumPrograms\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver1= new EdgeDriver();
		
		
		
		
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
		
	}

}

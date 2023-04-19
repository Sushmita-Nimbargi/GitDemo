import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowbasedPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Window based popups
		
		
		   //below two lines of code we have to add for ChromeDriver(chrome browser version) executor version above 111
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		//driver.get("https://the-internet.herokuapp.com/");
		//to handle window based pop ups pass username and password in the url
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();

	}

}

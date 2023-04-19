import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); //browser will open in maximised mode
		driver.get("http://www.google.com");//using get method -->it has internal wait method-->It will wait until all the components on the browser or screen is loaded
        driver.navigate().to("https://rahulshettyacademy.com"); //navigate to--> will not wait until all the components on the page are loaded -->it is used for internal navigation when browser is already there in automation mode to move from one page to another
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	
	}
	

}

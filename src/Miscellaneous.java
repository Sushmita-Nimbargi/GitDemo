import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //Video:108 maximizing window and deleting cookies
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //for deleting all the cookies
	    driver.manage().deleteAllCookies();
	    
	    // for deleting session cookies or any particular cookies incase ypu know the name pass that name
	   // driver.manage().deleteCookieNamed("sessionKey");
	    
	    driver.manage().window().maximize();
	    
	    
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    
	    //Taking Screenshot of browser
	    //cast the driver to TakesScreenshot class
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("D:\\SeleniumPrograms\\Screenshots\\screenshot.png"));
	    }

}

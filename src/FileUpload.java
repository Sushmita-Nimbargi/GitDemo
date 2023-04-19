import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 //below two lines of code we have to add for ChromeDriver(chrome browser version) executor version above 111
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(options);
	
	driver.get("https://www.ilovepdf.com/pdf_to_jpg");
	
	driver.findElement(By.cssSelector("[class*='uploader__btn']")).click();
	
	Thread.sleep(5000);
	//Runtime.getRuntime().exec("C:\\Users\\User\\OneDrive\\Documents\\Check\\fileupload.exe");
	Runtime.getRuntime().exec("‪D://SeleniumFileUpload//fileUploadScript.exe"+" "+"D:\\SeleniumFileUpload\\SunilHallticket.pdf");
	//driver.close();

	}

}

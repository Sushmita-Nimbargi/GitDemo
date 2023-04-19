import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Video105: Handling HTTPS certifications in Automated browsers
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//for firefox
	   FirefoxOptions options1= new FirefoxOptions();
	   options1.setAcceptInsecureCerts(true);
		
	   //proxy wont work here because we dont have proper ip address and port number
	   //adding proxy
	   Proxy proxy = new Proxy();
	   proxy.setHttpProxy("ipaddress:4444");
	   options.setCapability("proxy", proxy);
	   
	   //adding Extensions
	   //options.addExtensions(new File("/path/to/extension.crx"));
	   
	   //blocking popups
	   //options.setExperimentalOption("excludeSwitches",
      // Arrays.asList("disable-popup-blocking"));
	   
	   //downloading to specified path
	  // Map<String, Object> prefs = new HashMap<String, Object>();

	  // prefs.put("download.default_directory", "/directory/path");

	  // options.setExperimentalOption("prefs", prefs);
	   
	   

		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    
	    driver.get("https://expired.badssl.com/");
	   System.out.println(driver.getTitle());
	}

}

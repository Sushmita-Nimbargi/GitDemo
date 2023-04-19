import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching to frames
		// We can switch to frames in 3 ways
		//frame(index) -->index starts with 0
		//frame(id)
		//frame(webelement)
		
		
		//switching to frames using index
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		
		//switching to frame using web element
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		
		//driver.findElement(By.id("draggable")).click();
		//drag and drop
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		//.build() and .perform() are compulsary for actions to execute
		a.dragAndDrop(source, target).build().perform();
		
		//To come out of frames
		driver.switchTo().defaultContent();
		
		//clicking on Accept link just to check whether it is come out of frame or not
		driver.findElement(By.partialLinkText("Accept")).click();

	}

}

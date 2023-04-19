import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// video73: building programming logic to process items in array for cart
		// Add the veggies present in array to cart
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Adding the explicit wait
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		// defining an array
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		//clicking on bag button
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//relative x path---//button[contains(text(),'PROCEED TO CHECKOUT')]
		//finding element through text with xpath --//button[text()='PROCEED TO CHECKOUT']
		//clicking on proceed to checkout button using relative xpath
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Entering promocode
		///Thread.sleep(3000); --> It will wait for 3 seconds until before below line to load ,if there is any other element takes time to load this wait is not applies over there so again at that step we will face NoSuchElementException 
		//here we have add implicit wait so that to load css and avoid NoSuchElementException we can also add thread.sleep() but it will wait only before below line but if we add implicit wait it is applied to each and every line
		//Removing implicit wait globally adding explicit wait to target below element only
		
		//wait until promocode gets visible
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        //clicking on apply button
		driver.findElement(By.className("promoBtn")).click();
		//Explicit wait
		//wait until prmoinfo is displayed
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded) {
		int j = 0;
		// getting all products name and iterate over array list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Video:74 Format name to get actual vegetable name
			// In name we will get Brocolli -1 Kg
			// to get only Brocolli split by and - and trim to remove extra spaces
			// name[0] = Brocolli
			// name[1] = 1 Kg

			String[] name = products.get(i).getText().split("-");
			// System.out.println("name = "+name);
			String formattedName = name[0].trim();
			System.out.println("formattedName = " + formattedName);

			// check whether name you extracted is present in array or not
			// convert array into arraylist
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on add to cart
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// here we need to select multiple veggies so we should not use break statement
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}
}

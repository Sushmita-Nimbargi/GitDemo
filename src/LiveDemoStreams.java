import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//video:117 Perform webtable sorting using Selenium Java streams
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumPrograms\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    
	    // step1:click on column
	    driver.findElement(By.xpath("//tr/th[1]")).click();
	    
	    //Step2:Capture all webelements into a list
	    List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
	    
	    //step3:Capture text of all webelements into new(original) list
	    List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
	    
	    //step4:sort on the original list of step3-->sorted list
	    List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
	    
	    //step5:Compare original list with sorted list
	    Assert.assertTrue(originalList.equals(sortedList));
	    
	    //video:118 Build custom Selenium methods using Streams mapper
	    
	    //scan the name coulmn with gettext()->Beans-->print the price of the beans
	    List<String> price1 = elementsList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	    price1.forEach(a->System.out.println(a));
	    
	    
	    //doing pagination in the web table--> find the Rice and return the price of Rice
	    
	    List<String>price;
	    do {
	    	
	    	//Exach time we click on next button we should collect the list of all webelemnts
	    	List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
	    	price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
	    	
	    	price.forEach(a->System.out.println(a));
	    	if(price.size()<1) {
	    		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
	    	}
	    	
	    }while(price.size()<1);
	    
	    
	    
	    
	}
	//originalList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList())

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*QUESTION 7
----------
URL : https://www.cleartrip.com/trains

NOTE: Enter From ,TO  and click search trains
*/
		
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement from= driver.findElement(By.xpath("//*[@id=\"from_station\"]"));
		from.sendKeys("chennai");
		
		WebElement to =driver.findElement(By.xpath("//*[@id=\"to_station\"]"));
		to.sendKeys("coimbatore");

		
		WebElement searchtrain= driver.findElement(By.xpath("//*[@id=\"trainFormButton\"]"));
		searchtrain.click();
	
	}

}

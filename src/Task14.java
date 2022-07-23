import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	QUESTION 13
		-----------
		URL : https://www.myntra.com/register?referer=https://www.myntra.com/

		NOTE: Enter Mobile number and click continue*/
		
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
		WebElement phn = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
	    phn.sendKeys("9156705360");
	    
	    WebElement cont = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]"));
	    cont.click();

	}

}

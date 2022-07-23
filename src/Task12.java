import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12 {

	public static void main(String[] args) throws InterruptedException {

		
	/*	QUESTION 12
		-----------
		URL : https://www.snapdeal.com/

		NOTE: Click signin and click new register and enter mobile number abd click continue.
*/
		
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
System.out.println("code");
		
driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		
		WebElement sign = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]"));
	    sign.click();

	    WebElement regis = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]"));
		regis.click();
		Thread.sleep(2000);
	
		WebElement phneno= driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		phneno.sendKeys("9159705360");;
	
		WebElement cont= driver.findElement(By.xpath("//*[@id=\"checkUser\"]"));
		cont.click();

		System.out.println("457");
////
		System.out.println("457");;;//
	}

}

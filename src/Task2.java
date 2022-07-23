import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

/*		QUESTION 2
		-----------
		URL : https://www.facebook.com/

		NOTE: Enter email and password and click login(by using xpath locator).
*/
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("abcdefg");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("123456");
		
		Thread.sleep(2000);
		WebElement loginbtn =driver.findElement(By.name("login"));
		loginbtn.click();

	}

}

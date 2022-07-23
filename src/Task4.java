import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

/*QUESTION 4
-----------
URL : http://toolsqa.com/automation-practice-form/

NOTE: Give details and register the form. */
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement txtsrch= driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("iphone");
		WebElement btnclk =driver.findElement(By.id("nav-search-submit-button"));
		btnclk.click();

		
		}

}

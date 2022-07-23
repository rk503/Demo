import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	QUESTION 3
		-----------
		URL : http://demo.automationtesting.in/Register.html

		NOTE: Give details and register the form.
	*/	
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement txtsrch= driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("iphone");
		WebElement btnclk =driver.findElement(By.id("nav-search-submit-button"));
		btnclk.click();

		
		
		
			}

}

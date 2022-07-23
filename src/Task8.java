import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		QUESTION 10
		-----------
		URL : https://www.amazon.in/

		NOTE: Click any  product and click search

	*/	
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtsrch= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtsrch.sendKeys("phone");
		
		WebElement btn =driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	    btn.click();
	    System.out.println("1");
	   
	}

}

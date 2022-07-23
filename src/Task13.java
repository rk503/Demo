import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	QUESTION 14
		------------
		URL : https://www.swiggy.com/

		NOTE: Click sign up and Give details and register the form.
	*/	
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]"));
	    signup.click();
	    
	    WebElement phn = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
	phn.sendKeys("9159705360");
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("rk");
	
	
	WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
	email.sendKeys("rajdhilip666@gmail.com");
	
	WebElement psswd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	psswd.sendKeys("123456");
	
	driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/a")).click();
	}

}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*		
		QUESTION 6
		----------
		URL : https://www.redbus.in/

		NOTE: Click ^[opposite of this] and  signin/signup 
		      Enter Mobilenumber and click Generate OTP

	*/	
		
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement signclk= driver.findElement(By.xpath("//*[@id=\"sign-in-icon-down\"]"));
		signclk.click();
		
		WebElement signup =driver.findElement(By.xpath("//*[@id=\"signInLink\"]"));
		signup.click();

		Thread.sleep(2000);
		
		WebElement phonenum=driver.findElement(By.xpath("//*[@id=\"mobileNoInp\"]"));
		phonenum.sendKeys("9159705360");
		
		WebElement notrobotchckbox =driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
		notrobotchckbox.click();
		
		WebElement genotp=driver.findElement(By.xpath("//*[@id=\"otp-container\"]"));
		genotp.click();
		
	}

}

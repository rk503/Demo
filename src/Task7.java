import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	QUESTION 9
		-----------
		URL : https://www.flipkart.com/

		NOTE: Click Login and Entere Username password 
*/
		
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement usrnme= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		usrnme.sendKeys("9159705360");
		
		WebElement pswd =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	    pswd.sendKeys("1234");
	    
	    WebElement loginbtn =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	    loginbtn.click();
		
	}

}

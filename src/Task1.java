import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		//question1
	//	URL : https://www.amazon.in/
//		NOTE: Click start here. Enter iphone and search

		
		WebDriver driver = new ChromeDriver();;

		driver.get("https://www.amazon.in/");;
		driver.manage().window().maximize();
		WebElement txtsrch= driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("iphone");
		WebElement btnclk =driver.findElement(By.id("nav-search-submit-button"));
		btnclk.click();
System.out.println("hi");
	}

}
  

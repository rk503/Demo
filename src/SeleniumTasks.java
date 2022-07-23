import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTasks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

WebDriver driver = new ChromeDriver();


//1
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("abcd");
driver.findElement(By.id("pass")).sendKeys("1234");

//2
driver.get("https://www.redbus.in/");
driver.findElement(By.id("src")).sendKeys("Chennai");
driver.findElement(By.id("dest")).sendKeys("coimbatore");

// 3

driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("GreensTechnology");

//4
driver.get("https://infinity.icicibank.com/corp/Login.jsp");

//5

/*
driver.get("https://netbanking.hdfcbank.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("123456");
*/

//6
driver.get("https://www.swiggy.com/");
driver.findElement(By.id("location")).sendKeys("chennai");

//7

driver.get("https://www.snapdeal.com/login");
driver.findElement(By.id("userName")).sendKeys("123456789");


//8

driver.get("https://www.instagram.com/accounts/login/?hl=en)");
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("abcd");
driver.findElement(By.name("password")).sendKeys("12345");


//10
driver.get("http://adactinhotelapp.com/");
driver.findElement(By.id("username")).sendKeys("klmnop");
driver.findElement(By.id("password")).sendKeys("123456");
	}

}

<<<<<<< HEAD


=======
>>>>>>> 8159e8f75fe913c4104259bea80e9593a82453d9
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java tools\\chromedriver.exe");

		//question1
<<<<<<< HEAD
	//	URL : https://www.amazon.in/
//		NOTE: Click start here. Enter iphone and search

		
		WebDriver driver = new ChromeDriver();;

		driver.get("https://www.amazon.in/");
=======
		//hi
	//	URL : https://www.amazon.in/
//		NOTE: Click start here. Enter iphone and search
//kklp
		
		WebDriver driver = new ChromeDriver();;
		driver.get("https://www.amazon.in/");;
		
		driver.get("https://www.amazon.in/");;
		driver.manage().window().maximize();
		WebElement txtsrch= driver.findElement(By.id("twotabsearchtextbox"));
		txtsrch.sendKeys("iphonee");
		WebElement btnclk =driver.findElement(By.id("nav-search-submit-button"));
		System.out.println("hi");
		btnclk.click();
		
		System.out.println("hi");
		System.out.println("hi");

		

	}

}
  
=======
<<<<<<<< HEAD:src/Task1.java
		btnclk.click();
System.out.println("hi");
========
		btnclk.click();;
System.out.println("jii");
System.out.println("oo");
>>>>>>>> 8159e8f75fe913c4104259bea80e9593a82453d9:Task1.java
	}

}
  
>>>>>>> 8159e8f75fe913c4104259bea80e9593a82453d9

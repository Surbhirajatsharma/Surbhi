import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_LOCATOREXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/facebook.html");
	     
	     
//	     // 1- by using tag and class
//	     WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
//
//	    
//	     //2- by using tag and id
//	     WebElement pass=driver.findElement(By.cssSelector("input#pass"));
//	     un.sendKeys("surbhisharma");
//	     pass.sendKeys("surbhi@13");
	     
//	     
//	     // 3-by using the tag and attributes
//	     WebElement username = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//	     
//	     // 4 by using tag,class and attribute
//	     WebElement password=driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//	     
//	     un.sendKeys("surbhisharma");
//	     pass.sendKeys("surbhi@123");
//	     
//	     // 5 by using tag id and attributes
//	     
//	     WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//			login.click();
	     
		// 6 by using starts with- it will find the locator with the started character
			
		WebElement un=driver.findElement(By.cssSelector("input[name^=ema]"));
		un.sendKeys("surbhisharma");
	     
		
		// 7 by using ends with - it will find the locator based on ending character.
		WebElement pass=driver.findElement(By.cssSelector("input[type$='word'])"));
		pass.sendKeys("surbhi@123");
		
		// 8 by using the contain- it will find the locator based on character which is present or not
		WebElement login=driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASS_LOCATOREXAMPLE {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/facebook.html");
	     
	     WebElement username=driver.findElement(By.className("inputtext"));
	     WebElement password=driver.findElement(By.className("inputtext"));
	     
	     username.sendKeys("paresh");
	     password.sendKeys("paresh@123");

	}

}

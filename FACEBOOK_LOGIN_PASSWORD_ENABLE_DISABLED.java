import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK_LOGIN_PASSWORD_ENABLE_DISABLED {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver();
			     driver.get("https://demo.guru99.com/test/facebook.html");

			     WebElement username = driver.findElement(By.id("email"));
				 WebElement password = driver.findElement(By.id("pass"));
				 
				 boolean result = username.isDisplayed();
//					boolean result1 = username.isEnabled();
//					System.out.println(result);
//					System.out.println(result1);
	}
	if (username.isdi)

}

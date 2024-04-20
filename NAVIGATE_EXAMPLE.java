import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAVIGATE_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      
	      // 1- to open the url we can use navigate.method
	      driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	      
	      // 2- to refresh the page
	      driver.navigate().refresh();
	      
	      // 3- to redirect on back page
	      WebElement flight= driver.findElement(By.linkText("flight"));
	      flight.click();
	      Thread.sleep(0);
	      driver.navigate().back();
	      
	      //4- to redirect on forwardpage
	      driver.navigate().forward();
	      
	
	}
	

}

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLL_UP_SCROLL_DOWNEXAMPLE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://moneyboats.com/");	
          driver.manage().window().maximize();
          
          //-1 to scroll down we need to give positive value
          JavascriptExecutor js = (JavascriptExecutor)driver;
          Thread.sleep(1000);
          js.executeScript("window.scrollBy(0,500)");
          
          
          // 2- to scroll up we need to give (-)ve value
          Thread.sleep(1000);
          js.executeScript("window.scrollBy(0,-500)");
	}

}

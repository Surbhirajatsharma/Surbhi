import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DROPDOWN_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/newtours/register.php");	
	     
	      WebElement country  = driver.findElement(By.name("country"));
	      
	      Select Select = new select (country);
	      
	      //1.select by visible text
//	      select.selectbyvalue("bermuda"); 
	      
	      2// select by value
	      select.select 
	      

	}

}

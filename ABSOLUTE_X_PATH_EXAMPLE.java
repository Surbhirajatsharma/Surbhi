import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABSOLUTE_X_PATH_EXAMPLE {

	public static void main(String[] args) 
	
	{
		//TODO Auto-generated method stub
	      
		  System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/facebook.html");	
	      
	      WebElement username=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));
	      username.sendKeys("surbhisharma");
	      
	      WebElement password=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
	      password.sendKeys("surbhi@123");
	      
	      
	      WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
	      login.click();

	}

}

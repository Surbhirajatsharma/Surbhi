import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NESTED_FRAME_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Alerts.html");	
	      
	      WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/h5"));
			String value = text.getText();
			System.out.println(value);
			
			//We need to switch to child iframe to perform the operation
					driver.switchTo().frame(0);
					WebElement un = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
					un.sendKeys("surbhi");
			
		}

}

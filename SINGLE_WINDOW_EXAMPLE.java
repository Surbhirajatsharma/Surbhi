import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SINGLE_WINDOW_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Alerts.html");	
	      
	      WebElement button = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
			button.click();
			
			//Switching to parent iframe by using the webelement method
			
			WebElement parentIframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
			driver.switchTo().frame(parentIframe);
			
			WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/h5"));
			String value = text.getText();
			System.out.println(value);

	}

}

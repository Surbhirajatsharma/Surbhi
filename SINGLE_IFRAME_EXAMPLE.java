import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SINGLE_IFRAME_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Frames.html");	
	      
	      driver.manage().window().maximize();
	      // TO fetch the no of the iframes we will get the size of the i frames
	      
	      List<WebElement> noOfFrame = driver.findElements(By.tagName("iframe"));
			int size = noOfFrame.size();
			System.out.println("No of iframes in HTML page is "+size);
			
			//1. switch by index
//			driver.switchTo().frame(0);
			
			//2. switch by id
//			driver.switchTo().frame("singleframe");
			
			//3. switch by name
			driver.switchTo().frame("SingleFrame");
			
			WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
			text.sendKeys("surbhi");
	}

}

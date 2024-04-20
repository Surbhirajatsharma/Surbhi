import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAKE_A_SCREENSHOT_MTHODEXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://moneyboats.com/");	
         driver.manage().window().maximize();
         
         // FIRSTLY WE ARE creating reference of take a screen shot interface
         TakesScreenshot ts = (TakesScreenshot)driver;
 		
 		//calling getscreenshotas method to create image
 		File srcFile = ts.getScreenshotAs(OutputType.FILE);
 		
 		//Move the file into new destination folder
 		File destFile = new File("Z:\\Images\\error.png");
 		
 		//we will copy the screenshot into destination folder
 		 Files.(srcFile, destFile);
        
	}

}

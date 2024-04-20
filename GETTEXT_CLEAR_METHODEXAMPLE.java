import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTEXT_CLEAR_METHODEXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/facebook.html");	
	     
	     WebElement username=driver.findElement(By.id("email"));
	     username.sendKeys("surbhisharma");
	     
	     // to clear the populated text in the textbox we need to use clear method
	     
	     username.clear();
	     
	     
	     WebElement text=driver.findElement(By.tagName("h1"));
	     
	     // to fetch the value of particular elements we can use gettext method
	     
	     String value=text.getText();
	     System.out.println(value);

	}

}

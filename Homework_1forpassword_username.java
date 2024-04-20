import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_1forpassword_username {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	//This method will help you to set the path which we need to use to run the automation Scripts.	
    System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
    
    
    //to create chromedriver object we need to create web driver interface reference variable and need to create object for browser 
    WebDriver driver = new ChromeDriver();
    
	 
    //  This method will help you to open the any URL.
	driver.get("https://www.facebook.com/");
	 
	 
	 WebElement username=driver.findElement(By.id("email"));
	 WebElement password=driver.findElement(By.id("pass"));
	 WebElement Login=driver.findElement(By.name("login"));
	
	 username.sendKeys("surbhiraghuvanshi@yahoo.com");
	 password.sendKeys("surbhi@123");
	   
	 Login.click();
	}

}

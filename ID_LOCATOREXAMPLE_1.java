import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_LOCATOREXAMPLE_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	      //This method will help you to set the path which we need to use to run the automation Scripts.
			
	 
		  System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
			
					
		   // to create chromedriver object we need to create web driver interface reference variable and need to create object for browser
					
		   WebDriver driver = new ChromeDriver();
		
		   // To find the element by using the id locator firstly we need to create reference element of web 
		 
		    //1.get() - This method will help you to open the any URL.
		   
		   driver.get("https://demo.guru99.com/test/facebook.html");
		   
		   WebElement username =driver.findElement(By.id("email"));
		   
		   WebElement password= driver.findElement(By.id("pass"));
		    
		   WebElement login = driver.findElement(By.id("loginbutton"));
		   
		   
		  // send key method is used to enter the value in textbox
		   
		   
		   username.sendKeys("surbhirajatsharma@123");
		   password.sendKeys("surbhi");
		   
		   // click method is used to click on any button ,radio button , check box or link.
		   
		   login.click();
		   

		   
		   
		   
	}
	
	

}

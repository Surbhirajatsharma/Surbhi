import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RELATIVE_X_PATH_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/facebook.html");	
       
	      
	      // 1- by using simple x path method by using tag and attributes
	      
//	      WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
//	      WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
//	      WebElement login=driver.findElement(By.xpath("//input[@Tabindex='4']"));

	      
	      // 2- using and condition
	      
//	      WebElement username=driver.findElement(By.xpath("//input[@type='text' and name='email']"));
//	      WebElement password=driver.findElement(By.xpath("//input[@type='password' and Tabindex='2']"));
//	      WebElement login=driver.findElement(By.xpath("//input[@value=''Log In' and Tabindex='4']"));
   
          // 3- using or condition
//	       WebElement username=driver.findElement(By.xpath("//input[@type='text'or'  name='email']"));
//	       WebElement password=driver.findElement(By.xpath(null));
//	       WebElement login=driver.findElement(By.xpath(null));
      
	      //4 - using contains
//	       WebElement username=driver.findElement(By.xpath("//input[contains(@name,'ma')])"));
//	       WebElement password=driver.findElement(By.xpath("//input[contains(type,'pass')]"));
//	       WebElement login=driver.findElement(By.xpath("//input[contains(type,'sub')])"));
	       
	      
	      //5- using starts- with
//	       WebElement username=driver.findElement(By.xpath("//input[starts with(type,'te')])"));
//	       WebElement password=driver.findElement(By.xpath("//input[starts with(class,'in')]"));
//	       WebElement login=driver.findElement(By.xpath("//input[starts-with(type,'sub')])"));
	       
	      
//	      username.sendkeys("surbhisharma");
//	      password.sendkeys("surbhi@123");
//	      login.click();
	      
	      // 6- text method
	      
	      WebElement link=driver.findElement(By.xpath("//*[text()'Agile Project'])"));
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVA_SCRIPT_EXECUTOR_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/v4/index.php");	
          driver.manage().window().maximize();
          
       
       // 1- firstly we have to create the reference variable for java script
       JavascriptExecutor js = (JavascriptExecutor)driver;
       
       
       // 2- In java script executor interface we use two methods execute for scripts and Async scripts.
        driver.findElement(By.name("uid")).sendKeys("surbhisharma");
        driver.findElement(By.name("password")).sendKeys("surbhi@123");
        
        
        WebElement login = driver.findElement(By.name("btnLogin"));
         // we will execute below javasript to cliuck on login button
 //       js.executeScript("arguments[0].click();",login);
        
//        // we  will execute below  java script to handle the alert  
//        js.executeAsyncScript("alert('User or Password is not valid');");
        
        
          // we will below script to get the details of the webpage like Title, domain,URL
          String domainname = js.executeScript("return document.domain;").toString();
//        System.out.println(domainName);
//        
//        String title = js.executeScript("return document.title;").toString();
//        System.out.println(title);

//        String URL = js.executeScript("return document.URL;").toString();
//        System.out.println(url);
//        
//        // we will use below script to launch the new url
//        
	}

}

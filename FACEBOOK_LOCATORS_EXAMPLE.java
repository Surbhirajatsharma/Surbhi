import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK_LOCATORS_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login.php");
	    
//	    // 1- By using Tag and class tag means input and class means input text
//	    
//	    WebElement Un=driver.findElement(By.cssSelector("text\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\")"));
//	    WebElement Pas=driver.findElement(By.cssSelector("password.inputtext _55r1 inputtext _9npi inputtext _9npi"));
//	    Un.sendKeys("surbhisharma");
//	    Pas.sendKeys("surbhi@123");
//	    
//	    //2- By using Tag and id
//	    
//	    WebElement username=driver.findElement(By.cssSelector("text#email"));
//	    WebElement pass=driver.findElement(By.cssSelector("input#pass"));
//	    username.sendKeys("surbhisharma");
//	    pass.sendKeys("surbhi@13");
//	    
//	    
//	    //3- By using tag and attributes
//	    
//	    WebElement usn=driver.findElement(By.cssSelector("input.[name='email'][id='email'])"));
//	    WebElement password=driver.findElement(By.cssSelector("password.[name='pass'][id='pass'])"));
//	    usn.sendKeys("surbhisharma");
//	    password.sendKeys("surbhi#123");
//	    		
//	    //4 By using tag,class and attribute
//	    
//	    WebElement user=driver.findElement(By.cssSelector("text.inputtext _55r1 inputtext _1kbt inputtext _1kbt[name='email'][id='email'])"));
//	    WebElement pas=driver.findElement(By.cssSelector("password.inputtext _55r1 inputtext _9npi inputtext _9npi[name='pass'][id='pass')"));
//	    user.sendKeys("surbhisharma");
//	    pas.sendKeys("surbhi@123");
//	    
//	    
//	   // 5 by using tag id and attributes
//	    
//	    WebElement login=driver.findElement(By.cssSelector("loginbutton#[id='loginbutton'][name='login'])"));
//	    login.click();
	}
	

}

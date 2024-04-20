import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WebDriver_Practicle {

	public static void main(String[] args)
	 
	{
		
	 // TODO Auto-generated method stub
		
		
      //This method will help you to set the path which we need to use to run the automation Scripts.
		
 
	 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
		
				
	  // to create chromedriver object we need to create web driver interface reference variable and need to create object for browser
				
	   WebDriver driver = new ChromeDriver();
				
	   
	   //1.get() - This method will help you to open the any URL.
				
		driver.get("https://www.amazon.in/");
		
		// 3- 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// 4- to get the current URL
		
		String URL= driver.getCurrentUrl();
		
		
		// 5-
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		// 6- All tabs will be closed // difference between quit and close ask(imp)
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(URL);
		
		// 2- to close the current URL we use Close.
		
		driver.close();
		
				
		
	}}



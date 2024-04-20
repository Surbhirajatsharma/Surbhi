import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADIO_BUTTON_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/Register.html");
//	      
//	      WebElement radiobutton = driver.findElement(By.xpath("//*[@value='Male'])"));
//	      radiobutton.click();
//	      
//	      if(radiobutton.isSelected())
//	      {
//	    	  System.out.println("Radio button is already selected");
//	      }
//	}    
//	else
//	        {
//		
//		radiobutton1.click();
//	}
	
	     List<WebElement> allradio =driver.findElements(By.xpath("//*[@type='radio'])"));
                for(int i=0;i<allradio.size();i++) 
                {
                	String value=allradio.get(i).getAttribute("value");
                	if(value.equalsIgnoreCase("male"));
                	
                	{
                		allradio.get(i).click();
                	}
                }}}


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.css.model.Value;

public class NESTED_TABLE_EXMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/accessing-nested-table.html");	
            driver.manage().window().maximize();
            
         
           List<WebElement> Nestedtablerow = driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr)"));
           int size = Nestedtablerow.size();
         
         
           for(int i=0;i<size;i++)
         {
        	String Value = Nestedtablerow.get(i).getText();
        	System.out.println("value");
        	
         }

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLE_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/web-table-element.php");	
          driver.manage().window().maximize();
          
          // To fetch the all the column from the table we will use the below code
          
          List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
          System.out.println( "total no of columns");
          int size = columns.size();
          
          for( int i=0; i<size; i++)
          {
        	   String columnName = columns.get(i).getText();
        	   System.out.println(columnName);
        	  
        	  
          }
          
          //  to fetch the all the rows from the table we well use the below code
          
          
          List<WebElement> rows =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
          int size1 =rows.size();
          System.out.println("total no of rows are"+size1);
          
          for(int j=0;j<size1 ;j++)
          {
        	  String rowname = rows.get(j).getText();
        	  System.out.println(rowname);
          }
          
          
          // to fetch the cell data we will use the below code
          

  		 WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[3]"));
  		 System.out.println(cellData.getText());

	}     

}

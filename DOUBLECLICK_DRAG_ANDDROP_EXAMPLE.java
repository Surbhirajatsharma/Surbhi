import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DOUBLECLICK_DRAG_ANDDROP_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\AUTOMATION_BATCH_SEED MARCH_04-03-2024\\Software\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		//4. double click - it will double click on the given webelement
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(button).perform();
		
		//5. drag and drop method
		
		WebElement dragAndDrop = driver.findElement(By.linkText("Drag and Drop"));
		dragAndDrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
//		action.dragAndDrop(drag, drop).perform();
		action.dragAndDropBy(drag, 100, 100).perform();
		
	}

	}



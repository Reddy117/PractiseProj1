import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExtractingMultipleElements {
	WebDriver driver;
	//@Test
	public void getAlllinkElementsFromPage(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver1\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.jobserve.com/in/en/Job-Search/");
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for(WebElement link:links){
			 System.out.println(link.getText());
		 }
	}

	@Test
	public void getlinksFromSpecifiArea(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver1\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.jobserve.com/in/en/Job-Search/");
		 driver.findElement(By.xpath("//*[@id='lab3']")).click();
		 WebElement area=driver.findElement(By.xpath("//*[@id='ind']"));
		 List<WebElement> links=area.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for(WebElement link:links){
			 System.out.println(link.getText());
		 }
	}
}

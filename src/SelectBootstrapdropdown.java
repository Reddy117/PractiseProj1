import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SelectBootstrapdropdown {
	WebDriver driver;
	@Test
	public void dropDownLookLike(){
		
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver1\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.jobserve.com/in/en/Job-Search/");
		 driver.findElement(By.xpath("//*[@id='ddcl-selInd']/span/span")).click();
		 WebElement Insurtrybox=driver.findElement(By.xpath("//*[@id='ddcl-selInd-ddw']/div"));
		 List<WebElement> industries=Insurtrybox.findElements(By.tagName("label"));
		 
		 for(int i=1;i<industries.size();i++){
			 if(!industries.get(i).getText().equals("Legal")){
				 industries.get(i).click();
			 }
		 }
	

	}
	
}

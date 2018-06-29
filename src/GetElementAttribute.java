import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetElementAttribute {
	
	WebDriver driver;
	@Test
	public void getlinksFromSpecifiArea(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver1\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.jobserve.com/in/en/Job-Search/");
		 System.out.println(driver.findElement(By.xpath("//*[@id='txtKey']")).getAttribute("name"));
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkbox_RadioOthers {
	WebDriver driver;
	@Test
	public void OtherControls(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver2\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.findElement(By.xpath("//*[@id='checkbox1']")).click();
		 driver.findElement(By.xpath("//input[@value='FeMale']")).click();
	}

}

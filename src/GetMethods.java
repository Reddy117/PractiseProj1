import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetMethods {
	WebDriver driver;
	@Test
	public void getlinksFromSpecifiArea(){
		System.setProperty("webdriver.gecko.driver", "E:\\Projects\\Arvinth\\WebDriver1\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.jobserve.com/in/en/Job-Search/");
		 System.out.println(driver.getTitle()); //to get title
		 System.out.println("**************************************");
		 System.out.println(driver.getCurrentUrl());
		 System.out.println("**************************************");
		 System.out.println(driver.getPageSource());
	}
}

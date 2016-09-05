import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testrr {

	
	@Test
	public void testtry(){
		System.setProperty("webdriver.chrome.driver",
				"./ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tut.by");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try{
		driver.quit();
		}catch (Exception e){e.getMessage();}
	}
}

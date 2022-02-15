import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demo {
	
	@Test
public void tc() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.0.3");
	Thread.sleep(2000);
	driver.close();
	}
}

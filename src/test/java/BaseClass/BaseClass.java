package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		
		public static WebDriver driver;
		public static ThreadLocal<WebDriver>tdriver = new ThreadLocal<WebDriver>();
		public WebDriver initialize_driver() {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			tdriver.set(driver);
			return getDriver();
		}
			
			
		
		
		public static synchronized WebDriver getDriver() {
			return tdriver.get();
		}

	}



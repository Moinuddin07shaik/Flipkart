package Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

    public class Library {
	public static WebDriver driver;

	public static Properties prop;
	protected static Logger logger;

	public void launchapplication() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\moinu\\eclipse-workspace\\Flipkart\\src\\test\\resources\\property\\config.properties");
		prop = new Properties();
		prop.load(fis);
		logger=logger.getLogger(Library.class);
		PropertyConfigurator.configure("C:\\Users\\moinu\\eclipse-workspace\\Flipkart\\src\\test\\resources\\property\\Log4j.properties");
		try {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				logger.info("************************* Chrome Browser Launched *********************");
			} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				logger.info("************************* Edge Browser Launched *********************");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
			logger.info("************************* Application Launched *********************");

		} catch (Exception e) {
			System.out.println("browser did not launch");
		}
	}

	public void teardown() {
		// driver.quit();

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase {
public static WebDriver driver;
	
	@BeforeClass
	public void browsersetup() {
		//String driverPath = "E:\\seleniumjars\\selenium-java-3.141.59\\MavenProject\\src\\test\\java\\Browser_driver\\chromedriver.exe";
		String driverpath = System.getProperty("user.dir")+"\\src\\Browser_driver\\chromedriver.exe";
		
		System.out.println(driverpath);
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
	}
	
	@Test
	public void launchApp() {
		driver.get("https://www.facebook.com/");
	}
}



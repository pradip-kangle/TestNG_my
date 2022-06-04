package hiii2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test(priority=1)
	public void LaunchURLtest(String browser) {

		Reporter.log("Running browser is:" + browser,true);

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.get("http://demo.guru99.com/v4/index.php");

	}
	
	

	@Parameters({ "username", "password" })
	@Test(priority=2)
	public void LaunchURLtest2(String username, String password) {

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr413439");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tEzAqas");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

}

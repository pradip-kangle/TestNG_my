package testngparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_parallie_part2 {

	WebDriver driver;

	@Test(threadPoolSize = 3, invocationCount = 3)
	public void TC1() {

		System.out.println("This output for TC1:" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}

	@Test
	public void TC2() {

		System.out.println("This output for TC2:" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	}

	@Test
	public void TC3() {

	}

}

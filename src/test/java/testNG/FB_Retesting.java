package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FB_Retesting {
	WebDriver driver;

	@BeforeClass
	public void bc() {
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "dp")
	public void f(String un, String pswd) throws Exception {
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "twetr23423drf3@gmail.com", "agsdtg445a" },
				new Object[] { "retwe423drf3@gmail.com", "aergsdtg445a" },
				new Object[] { "54765dfghretwe423drf3@gmail.com", "34654aergsdtg445a" },
				new Object[] { "y745sfrretwe423drf3@gmail.com", "tgyhaergsdtg445a" }, };
	}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmentsrujan {
	
  @Test
  
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	
	  driver.navigate().to("https://collegeweeklive.com/go-signup/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
      driver.findElement(By.id("submit")).click();
      String FirstNameN = driver.findElement(By.id("firstNameError")).getText();
      String LastName = driver.findElement(By.id("lastNameError")).getText();
      String emailAddress = driver.findElement(By.id("emailAddressError")).getText();
      String password = driver.findElement(By.id("passwordError")).getText();
      String ConfirmPassword = driver.findElement(By.id("ConfirmPasswordError")).getText();
      
      
      
      System.out.println(FirstNameN);
      System.out.println(LastName);
      System.out.println(emailAddress);
      System.out.println(password);
      System.out.println(ConfirmPassword);
      
  }

	

}

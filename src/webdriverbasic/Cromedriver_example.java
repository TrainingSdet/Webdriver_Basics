package webdriverbasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Cromedriver_example {
	
	public WebDriver driver;
	
  @Test
  public void testCromedriver_example() {
	  
	  driver.get("https://www.google.com/");
	  driver.findElement(By.className("gLFyf gsfi")).sendKeys("newyork");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "c:\\jar\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  
	  //driver.quit();
  }

}

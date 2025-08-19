package Testing_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Task5 {
	 WebDriver driver;
  
  @BeforeTest
  public void setup() {
      driver = new ChromeDriver();
      driver.get("https://www.ebay.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.manage().window().maximize();
  }
  @DataProvider(name="loginData")
  public Object[][] loginData() {
      return new Object[][]{
              {"usern 4857","password1"},
              {"           ","3584732"},
              {"ravadapriyankael.6@gmail.com", "Priya@678"}
      };
  }

  @Test(dataProvider="loginData")
  public void login(String username, String password) throws InterruptedException {
	  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
      WebElement name = driver.findElement(By.id("userid"));
      name.clear();
      name.sendKeys(username);
      driver.findElement(By.id("signin-continue-btn")).click();
      WebElement pass = driver.findElement(By.id("pass"));
      pass.clear();
      pass.sendKeys(password);
      driver.findElement(By.id("sgnBt")).click();
      Thread.sleep(3000);
      
  }


  @AfterTest
  public void afterTest() {
  }

}

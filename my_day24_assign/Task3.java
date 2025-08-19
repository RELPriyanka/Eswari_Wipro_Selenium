package Testing_package;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Task3 {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	     driver.manage().window().maximize();
	     
		    
	  }	
	 @Test
	  public void login() throws InterruptedException {
		  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
	      WebElement name = driver.findElement(By.id("userid"));
	      
	      name.sendKeys("ravadapriyankael.6@gmail.com");
	      driver.findElement(By.id("signin-continue-btn")).click();
	      WebElement pass = driver.findElement(By.id("pass"));
	      
	      pass.sendKeys("Priya@678");
	      driver.findElement(By.id("sgnBt")).click();
	      Thread.sleep(3000);
	      
	  }
	  
	  @Test(priority=2,dependsOnMethods="login")
	  public void all_cat() throws InterruptedException {
	      
	      WebElement cate=driver.findElement(By.id("gh-cat"));
	      Select cate1=new Select(cate);
	      cate1.selectByValue("267"); 
	      
	      
	      WebElement search1= driver.findElement(By.id("gh-ac"));
	      search1.clear();
	      search1.sendKeys("Books"); 
	      search1.sendKeys(Keys.ENTER);
	    
	}
	  @Test(priority=3,dependsOnMethods="all_cat")
	  public void signout() throws InterruptedException {	
		    Actions a=new Actions(driver);
			WebElement change=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button"));
			a.moveToElement(change).perform();

		  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[3]/a")).click();
		    }


  @AfterTest
  public void afterTest() {
  }

}

package Testing_package;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Task4 {
	WebDriver driver;
  @Test
  @Parameters({"username", "password"})
  public void test(@Optional("admin")
  String user, @Optional("admin@123")
  String pass){
	  System.out.println("Username"+user);
	  System.out.println("password"+pass);
	  if(user.equals("admin")&& pass.equals("admin@123")) {
		  System.out.println("Logged in");
	  }
	  else {
		  System.out.println("Failed");
	  }
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}

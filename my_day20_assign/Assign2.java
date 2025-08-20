package testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
        d.get("https://demoqa.com/select-menu");
        d.manage().window().maximize();
        

        // Single select 
        WebElement select =d.findElement(By.id("oldSelectMenu"));
        Select s=new Select(select);
        s.selectByVisibleText("Blue");
        s.selectByIndex(1);
        
        // Multi select 
        WebElement multiS=d.findElement(By.id("react-select-4-input"));
        multiS.sendKeys("Green");
        multiS.sendKeys(Keys.ENTER);

        multiS.sendKeys("Yellow");
        multiS.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        multiS.sendKeys("Black");
        multiS.sendKeys(Keys.ENTER);
        
        

        Thread.sleep(6000);
        d.quit();
		

	}

}

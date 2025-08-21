package testng2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertscl{

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		d.manage().window().maximize();		
		WebElement sealert=d.findElement(By.id("alertButton"));
		sealert.click();
		Thread.sleep(4000);
		Alert alert=d.switchTo().alert();
		alert.accept();		
		Thread.sleep(4000);
		
		WebElement timealert=d.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(6000);
		Alert alert1=d.switchTo().alert();
		alert1.accept();
		Thread.sleep(3000);
		
		WebElement confalert=d.findElement(By.id("confirmButton"));
		confalert.click();
		Thread.sleep(4000);
		Alert alert2=d.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(3000);
		
		WebElement promptalert=d.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(3000);
		Alert alert3=d.switchTo().alert();
		alert3.sendKeys("MSD");
		alert3.accept();
		
		Thread.sleep(3000);
		d.close();
	}

}

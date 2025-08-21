package testng2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class AllActionsp {

	WebDriver driver;
	@BeforeTest
	public void set() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void dragAndDrop() {
		driver.get("https://demoqa.com/droppable");
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		Assert.assertTrue(false,"failed");
	}

	@Test(priority = 2)
	public void multiSelectDropdown() throws InterruptedException {
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Single select
		WebElement select=driver.findElement(By.id("oldSelectMenu"));
		Select s=new Select(select);
		s.selectByVisibleText("Yellow");

		// Multi select
		WebElement multiSelect=driver.findElement(By.id("react-select-4-input"));
		multiSelect.sendKeys("Blue");
		multiSelect.sendKeys(Keys.ENTER);
		multiSelect.sendKeys("Black");
		multiSelect.sendKeys(Keys.ENTER);
		Assert.assertTrue(false, "Multiple selection failed");
	}

	@Test(priority = 3)
	public void promptAlert() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.sendKeys("NSD");
		al.accept();
		Assert.assertTrue(false, "Prompt alert verification failed");
	}

	@AfterTest
	public void stop() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

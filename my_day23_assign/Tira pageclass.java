package Testing_package;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pageclass2 {
	WebDriver driver;
   
   // By acnt=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/div/a/div/img");
    				
  //  By personald=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[1]/div[1]/div[1]/a");
  //  By name=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/input");
    
 //   By date = By.cssSelector("input[placeholder=\"dd/mm/yyyy\"]");
 //   By email=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[2]/div[7]/div[1]/input");
 //   By save=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div/div/div[2]/div[3]/div/div/button");
    
    By search1=By.id("search");
    
    //By addToCart=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div/div/div[2]/div/button");
    By cart=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/a/div[1]/img");
   
    By delcart=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/div/button[1]/img");
  //  By remove=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/button[1]");
   
    // help center
   By hc=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/a"); 
   By giveno=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[4]/div[1]/div/div/span/input");
    By giveemail=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[4]/div[2]/div/input");
    By subject=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[4]/div[3]/div/div[1]/input");
    By detail=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[4]/div[5]/div/div[1]/textarea");
    By submithc=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[5]/button");
    
    
    
   // By goback=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div/div/div/span/a/img");
    By goback=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div/div/div/span/a/img");
    By brand1=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/a");
    
    
    
    
    By address=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[1]/div[1]/div[4]/a/div/p[1]");
    By editadd=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div[2]/div/label/div/div[3]/img"); 
    By pincode= By.cssSelector("input[name='pincode.name']");
    By building= By.cssSelector("input[name='address']");
    By update=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/button[1]");

   
    
    By offers=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div/a");
    By hoverimage=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[1]/a/div/div[1]/div[1]/div[2]/picture/img");
    By size=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[1]/a/div/div[3]/div/div/div[2]/button");
    By exactsize=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[1]/a/div/div[3]/div/div/div[2]/div/div[2]/div[3]/div[1]/div");
    By thenbag=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[1]/a/div/div[3]/div/div/div[2]/button");
    
    By notify=By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[1]/div/div[3]/div/div/input");
    By send=By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[1]/div/div[3]/div/button");
    
    // to hover on prod
    By essence=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[3]/a/div/div[1]/div[1]/div[2]/picture/img");
    By essencetocart=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div/div[2]/div[3]/a/div/div[3]/div/div/div[2]/button");
    // top categories
    By topcat=By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[1]/a/picture/img");
    By top2=By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img");
    //insta
    By insta=By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[3]/div/div[2]/div[2]/a/img");
    
    //virtual try
    By vT=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div[2]/div[2]/a/div/div[1]/div[1]/div[2]/picture/img");
    By vtfunc=By.xpath("//*[@id=\"1productListSpecial\"]/div/div[2]/div/div[2]/div[2]/a/div/div[1]/div[1]/div[2]/div/span");
    By actualvt=By.xpath("//*[@id=\"makeup-ar\"]/div/div[1]/div/svg");
    By vtimg=By.xpath(" //*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div/img");
    
    
    By share=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div[2]/div[1]/div/div[3]/div/div/div[2]/div[16]/div/img");
    By whatsapp=By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[4]/div[2]/div[2]/a");
    By slide=By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[3]/svg/path");
    
    By imageslide=By.xpath("//*[@id=\"3image-slideshow\"]/div/div/div[3]/div[1]/ul/li[3]/button");
    
    By faq=By.xpath("//*[@id=\"app\"]/div/div/div[6]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/a");
    By faqq=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/main/div/div/div[11]/a/div");
    By desc=By.xpath("//*[@id=\"item_name\"]");

    public Pageclass2(WebDriver driver) {
        this.driver = driver;
    }
    /*
    public void login1(String n, String d, String p) {
    	driver.findElement(acnt).click();
    	driver.findElement(personald).click();
        driver.findElement(name).sendKeys(n);
        driver.findElement(date).sendKeys(d);
        driver.findElement(email).sendKeys(p);
        driver.findElement(save).click();
    }           */
    
    
    public void search1(String q)
    {
    	 WebElement searcha= driver.findElement(search1);
         searcha.clear();
         searcha.sendKeys(q);
         searcha.sendKeys(Keys.ENTER);
    }
    
    public void addanddeletetocart() {
  	  Actions act=new Actions(driver);
  	  driver.navigate().to("https://www.tirabeauty.com/product/lakme-eyeconic-liquid-eyeliner---black-45ml-utwgvaxzwt");
  	  driver.findElement(By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]")).click();
  	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/a/div[1]/img")).click();
  	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/div/button[1]/img")).click();
  	  driver.findElement(By.cssSelector("button[class=\"remove\"]")).click();
  	  driver.findElement(goback).click();
  	  
    }
   
    public void helpcen(String w,String x, String y, String z)
    {
    	driver.findElement(hc).click();
    	driver.findElement(giveno).sendKeys(w);
    	driver.findElement(giveemail).sendKeys(x);
    	driver.findElement(subject).sendKeys(y);
    	driver.findElement(detail).sendKeys(z);
    	driver.findElement(submithc).click();
    }

    public void brand() throws InterruptedException {
    	Actions a=new Actions(driver);
    	WebElement change=driver.findElement(brand1);
    	a.moveToElement(change).perform();
    	Thread.sleep(3000);
    
    }
    public void instagram() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
    	driver.findElement(insta).click();
    	  // switch to main window
         driver.navigate().to("https://www.tirabeauty.com/");
    	//WebElement back1= driver.findElement(goback);
      //  back1.clear();
    	
    	
    }
    public void offer() throws InterruptedException
    {
    	driver.findElement(offers).click();
    	Actions a=new Actions(driver);
    	WebElement change6=driver.findElement(hoverimage);
    	a.moveToElement(change6).perform();
    	Thread.sleep(3000);
    	driver.findElement(size).click();
    	driver.findElement(exactsize).click();
    	
    }
    public String getDesc1() {
        return driver.findElement(desc).getText();
        
    }
    
    public void subscription(String g) throws InterruptedException
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
    	driver.findElement(notify).sendKeys(g);
    	driver.findElement(send).click();
    	
    }
    public void shade() throws InterruptedException
    {
    	
    	driver.navigate().to("https://www.tirabeauty.com/product/m-a-c-macximal-matte-lipstick-mehr-3g-7596758");
    	
    	
    	driver.findElement(share).click();
    }
    public void faqss() throws InterruptedException
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
    	driver.findElement(faq).click();
    	driver.findElement(faqq).click();
    	
    }
    
    
    
    
   
    

   
    
 

}


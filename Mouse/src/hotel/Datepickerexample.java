package hotel;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import static org.openqa.selenium.OutputType.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;;

public class Datepickerexample {
	
	 private static String today="20/08/2017";
    public static void main(String[] args) throws Exception {
    	ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://www.phptravels.net/");
        
        // search box
        
        driver.findElement(By.linkText("Search by Hotel or City Name")).click();
        driver.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("dubai");
        Thread.sleep(1000);
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("div.searchground"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='searchground']/div[2]"))).build().perform();
        driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[1]/div")).click();
        
       
try {
        new Actions(driver).moveToElement(driver.findElement(By.name("checkin"))).build().perform();
        driver.findElement(By.name("checkin")).click();
        
        
        WebElement datetable= driver.findElementByXPath("html/body/div[14]/div[1]/table/tbody");
        
   	   List<WebElement> rows = datetable.findElements(By.tagName("tr"));
   	   
   	   int n=rows.size();
   	   
       System.out.println(n+" row size.....");

   	   List<WebElement> col = datetable.findElements(By.tagName("td"));
   	   
   	   int c=col.size();

   	System.out.println(c+" col size.....");
   	
   	 for(WebElement s : col)
      {
    	  System.out.println(s.getText()+"------");
      }
        
      
      for(WebElement tdata:driver.findElements(By.tagName("td")))
      {
      System.out.println(tdata.getText());
      } 
       //  String s=datetable.getText();
        
        // System.out.println(s);
        
       //for (WebElement cell: date) {
    	   
    	   //System.out.println(cell.getText());
       //}
       
            
            //If you want to click 18th Date
           // if (cell.getText().equals("25")) {
            	// cell.click();
            	// break;
            	
            	/*
            //Select Today's Date
            if (cell.getText().equals(today)) {
               
               
               
            } */
        
       

              
        Thread.sleep(1000);
        
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[5]"))).build().perform();
       // driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[5]")).click();

       
} 

catch (Exception e){
   System.out.println(e);
  }
        
        Thread.sleep(3000);
        
        driver.quit();

    }
    
    
    public static boolean isAlertPresent(FirefoxDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

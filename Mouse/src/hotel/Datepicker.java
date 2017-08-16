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

public class Datepicker {
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
        
       // mouse action calander
try {
        new Actions(driver).moveToElement(driver.findElement(By.name("checkin"))).build().perform();
        driver.findElement(By.name("checkin")).click();
        
        WebElement dates= driver.findElementByXPath("html/body/div[13]/div[1]/table/tbody");
        
        List<WebElement> date= dates.findElements(By.name("td"));
        
        String s=dates.getText();
        
      System.out.println(s);

        
       
        for(WebElement ate: date) 
        {
        	
        	String cal=ate.getAttribute("day");
        	System.out.println(cal);
        }
        
		

              
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

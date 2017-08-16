package hotel;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class php {
    public static void main(String[] args) throws Exception {
        FirefoxDriver driver;
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://www.phptravels.net/");
        
        
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[4]/div[2]/div/ul"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='dpd2']//label[.='Check out']"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.name("checkin"))).build().perform();
        driver.findElement(By.name("checkin")).click();
        
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[2]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[3]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[4]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[5]"))).build().perform();
        
        
        driver.findElement(By.xpath("//div[14]/div[1]/table/tbody/tr[4]/td[5]")).click();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[8]/div"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[15]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[15]/div[1]/table/tbody/tr[4]/td[2]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[15]/div[1]/table/tbody/tr[4]/td[3]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[15]/div[1]/table/tbody/tr[4]/td[5]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[15]/div[1]/table/tbody/tr[4]/td[6]"))).build().perform();
        driver.findElement(By.xpath("//div[15]/div[1]/table/tbody/tr[4]/td[6]")).click();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("h2.main-title.go-right"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[8]/div"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[7]/div"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[7]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='searchground']/div[2]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='HOTELS']//button[.='Search']"))).build().perform();
        driver.findElement(By.xpath("//div[@id='HOTELS']//button[.='Search']")).click();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("div.labelleft2.rtl_title_home"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("td"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("div.labelleft2.rtl_title_home"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='itemscontainer']/table/tbody/tr[1]/td/div/div[2]/div/div[2]/h4"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.linkText("Rendezvous Hotels"))).build().perform();
        driver.findElement(By.linkText("Rendezvous Hotels")).click();
        new Actions(driver).moveToElement(driver.findElement(By.linkText("Rendezvous Hotels"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[5]/div[3]/div/table/tbody/tr[1]/td/div/div[2]/div/div[2]/h4/a/b"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("html"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='OVERVIEW']/div/div[2]/div[1]/div[3]/div/img[1]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='fotorama__nav-wrap']/div/div/div[6]/div"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("img.fotorama__img"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next"))).build().perform();
        driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next")).click();
        driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next")).click();
        driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next")).click();
        driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next")).click();
        driver.findElement(By.cssSelector("div.fotorama__arr.fotorama__arr--next")).click();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@class='fotorama__stage']/div[1]/div[2]/img"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='OVERVIEW']/div/div[2]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='OVERVIEW']//div[.='Hotel Amenities']"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("div.panel-body"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id='OVERVIEW']/div/div[1]/div[1]/div[2]/div/p[2]"))).build().perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector("small.go-right"))).build().perform();
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
